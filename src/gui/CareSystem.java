//package gui;
//
//import javafx.application.Application;
//import java.util.*;
//import java.io.*;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class CareSystem extends Application {
//    
//  public Map<Integer, String> petowner = new HashMap<>();
//  public Map<Integer, String> veterinarian = new HashMap<>();
//  public ArrayList<String> appointments= new ArrayList<>();
//public Map<Integer, HealthRecord> ListOfHealthRecord = new HashMap<>();
//public Map<Integer, Prescription> ListOfPrescricption = new HashMap<>();
//public Map<Integer, PetTreatmentHistory> Listtreatmenthistory= new HashMap<>();
//
//    @Override
//    public void start(Stage primaryStage) {
//admin scene
//        VBox sencelayoutadmin = new VBox(10);
//        TextField IDtextfeild = new TextField();
//        Label labeladminid = new Label("ID:");
//        Button signIn = new Button("SIGN IN");
// 
//        sencelayoutadmin.getChildren().addAll(labeladminid,IDtextfeild,signIn);
//        Scene sceneadmin = new Scene(sencelayoutadmin,300,200);                
//user scene
//        VBox sencelayoutuser = new VBox(10);
//        Label vet = new Label("vet");
//        Label pet = new Label("pet");
//        Button addpet = new Button("Add pet");
//        Button editpet = new Button ("edit Pet data");
//        Button removepet = new Button ("remove pet data ");
//        Button listepet = new Button ("list all  pets");
//        Button addvet = new Button("Add vet");
//        Button editvet = new Button ("edit vet data");
//        Button removevet = new Button ("remove vet data ");
//        Button listevet = new Button ("list all  vets");
//        Button Reminder = new Button ("Send Reminder");
//        Button manage= new Button("manage");
//            
//        sencelayoutuser.getChildren().addAll(vet,pet,addpet,editpet,removepet,listepet,addvet,editvet,removevet,listevet,Reminder);
//        Scene sceneuser = new Scene(sencelayoutuser,300,200);        
//add pet scene 
//            VBox sencelayoutaddpet = new VBox(10);
//            Label petid = new Label(" Enter Pet ID:");
//            TextField petId  = new TextField();
//            Label petNmae = new Label(" Enter Pet Name:");
//            TextField petName = new TextField(); 
//            Button addPet = new Button("Add Pet Data ");
//            addPet.setOnAction(e->{
//        try {
//            int ID = Integer.parseInt(petId.getText());   
//            String name = petName.getText();
//        if (petowner.containsKey(ID)) {
//            throw new IllegalArgumentException("Pet owner with ID " + ID + " already exists.");
//        }
//            File file = new File("petowners.txt");
//        if (!file.exists()) {
//            file.createNewFile(); 
//        }
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("petowners.txt", true))) {
//            writer.write("ID: " + ID + ", Name: " + name);
//            writer.newLine();
//        }
//            petowner.put(ID, name);
//            System.out.println("ID = " + ID + ", Name = " + name);
//            petId.clear();
//            petName.clear();  
//        }catch (IllegalArgumentException o) {
//            System.out.println("Error: " + o.getMessage());
//        }catch (IOException ex) {
//            System.out.println("Error writing to file: " + ex.getMessage());
//        }
//    });
//           sencelayoutaddpet.getChildren().addAll(petid,petId,petNmae,petName,addPet);
//           Scene sceneaddpet = new Scene(sencelayoutaddpet,300,200);
//           addpet.setOnAction(e->{
//           primaryStage.setScene(sceneaddpet); 
//    });         
//edit pet scene
//           VBox editpetscence = new VBox(10);
//           Label newpetId  = new Label(" new  pet ID:");
//           TextField newpetiddata = new TextField();
//           
//           Label  newpetname = new Label(" new Name:");
//           TextField newpetnamedata = new TextField();
//           
//           Label oldPetId = new Label(" current pet  id");
//           TextField oldPetIddata = new TextField();
//           
//           Button editPetdata = new Button("Add  new PET");
//           
//           editPetdata.setOnAction(e -> {           
//            File file = new File("petowners.txt");
//        if (file.exists()) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] parts = line.split(", ");
//                    int id = Integer.parseInt(parts[0].split(": ")[1]);
//                    String name = parts[1].split(": ")[1];
//                    petowner.put(id, name);
//                }
//            } catch (IOException p) {
//                System .out.println("Error reading from file: " + p.getMessage());
//            }
//            }
//               try {                  
//                int newID = Integer.parseInt(newpetiddata.getText());
//                String newName = newpetnamedata.getText();
//                int oldID = Integer.parseInt(oldPetIddata.getText());
//                if (petowner.isEmpty()) {
//                    throw new IllegalArgumentException("The map is empty");
//                }
//                if (!petowner.containsKey(oldID)) {
//                    throw new IllegalArgumentException("Pet owner with ID " + oldID + " does not exist.");
//                }
// Remove the old entry and add the new one
//                petowner.remove(oldID);
//                petowner.put(newID, newName);
//                System.out.println("Updated pet owner ID " + oldID + " to new ID " + newID + " with name " + newName);
//
// Write updated data back to the file                
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("petowners.txt"))) {
//            for (Map.Entry<Integer, String> entry : petowner.entrySet()) {
//                writer.write("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//                writer.newLine();
//            }
//        }
// Clear input fields
//                newpetiddata.clear();
//                newpetnamedata.clear();
//                oldPetIddata.clear();
//            } catch (IllegalArgumentException l) {
//                System.out.println("An error occurred: " + l.getMessage());
//            } catch (IOException ex) {
//                System.out.println("Error writing to file: " + ex.getMessage());
//            }
//        });
//
//editpetscence.getChildren().addAll(newpetId, newpetiddata, newpetname, newpetnamedata, oldPetId, oldPetIddata, editPetdata);
//        Scene sceneEditPet = new Scene(editpetscence, 300, 200);
// Button to switch to the edit pet scene
//        editpet.setOnAction(e -> {
//            primaryStage.setScene(sceneEditPet);
//        });
//remove pet secne             
//            VBox removepetlayout = new VBox(10);
//            Label  petidremove = new Label(" Enter Pet ID to Remove :");
//            TextField textField6 = new TextField();
//            Button removepetdata = new Button(" remove pet ");
//            
//           removepetdata.setOnAction(e->{
//        try {
//                int ID1 = Integer.parseInt(textField6.getText());
//                File file = new File("petowners.txt");
//            if (file.exists()) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(", ");
//                int id = Integer.parseInt(parts[0].split(": ")[1]); 
//                String name = parts[1].split(": ")[1]; 
//                petowner.put(id, name); 
//            }
//        } catch (IOException ex) {
//                System.out.println("Error reading from file: " + ex.getMessage());
//            }
//            }            
//        if(petowner.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//        }
//        if(!petowner.containsKey(ID1)){
//             throw new IllegalArgumentException("Pet owner with ID " + ID1 + " does not exist.");
//            }            
//            petowner.remove(ID1);
//            System.out.println("ID = " + ID1 + "removed");
//            
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("petowners.txt"))) {
//                    for (Map.Entry<Integer, String> entry : petowner.entrySet()) {
//                        writer.write("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//                        writer.newLine();
//                    }
//                    
//                } catch (IOException ex) {
//                    System.out.println("Error writing to file: " + ex.getMessage());
//                }       
//                textField6.clear();
//             }catch (NumberFormatException ex) {
//                System.out.println("Error: Please enter a valid number.");
//            } catch (IllegalArgumentException u) {
//                System.out.println("Error: " + u.getMessage());
//            }            
//           });
//            removepetlayout.getChildren().addAll(petidremove,textField6,removepetdata);
//            Scene removepetscene = new Scene(removepetlayout,300,200);
//            removepet.setOnAction(e->{
//            primaryStage.setScene(removepetscene);                
//            });
//list pet scene
//            VBox listpetlayout = new VBox(10);
//            Button displayPetOwnersButton = new Button("Display Pet Owners");
//        displayPetOwnersButton.setOnAction(e -> {
//             try{
//                 File file = new File("petowners.txt");
//        if (file.exists()) {
//            try (BufferedReader reader = new BufferedReader(new FileReader("petowners.txt"))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] parts = line.split(", ");
//                    int id = Integer.parseInt(parts[0].split(": ")[1]);
//                    String name = parts[1].split(": ")[1]; 
//                    petowner.put(id, name); 
//                }
//            }
//        }else {
//            throw new FileNotFoundException("File does not exist:");
//        }                 
//        if(petowner.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//            }            
//            for (Map.Entry<Integer, String> entry : petowner.entrySet()) {
//                    String displayText = "Pet Owner ID: " + entry.getKey() + ", Name: " + entry.getValue();
//                    Label label = new Label(displayText); 
//                    listpetlayout.getChildren().add(label);
//                }                                
//                } catch (IllegalArgumentException ex) {
//                System.out.println("An error occurred: " + ex.getMessage());
//             } catch (IOException ex) {
//                System.out.println("Error reading from file: " + ex.getMessage());
//             }
//        });        
//        listpetlayout.getChildren().addAll(displayPetOwnersButton);
//         Scene listpetscene = new Scene(listpetlayout,300,200);
//        listepet.setOnAction(e->{
//                primaryStage.setScene(listpetscene);
//            });
//        
//add vet scene 
//           VBox sencelayoutaddvet  = new VBox(10);
//           Label vetid = new Label(" Enter Vet ID:");
//           TextField vetId  = new TextField();
//           Label vetName = new Label(" Enter Vet Name:");
//           TextField vetName1 = new TextField(); 
//           Button addvetdata = new Button("Add Vet Data ");
//           
//           addvetdata.setOnAction(e->{
//        try {
//            int ID = Integer.parseInt(vetId.getText());   
//            String name = vetName.getText();
//        if (veterinarian.containsKey(ID)){
//            throw new IllegalArgumentException("veterinarian with ID " + ID + " already exists.");
//        }
//            File file = new File("veterinarian.txt");
//        if (!file.exists()) {
//            file.createNewFile(); 
//        }
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veterinarian.txt", true))) {
//            writer.write("ID: " + ID + ", Name: " + name);
//            writer.newLine();
//        }
//            veterinarian.put(ID, name);
//            System.out.println("ID = " + ID + ", Name = " + name);
//
//            vetId.clear();
//            vetName1.clear();  
//      }catch (IllegalArgumentException o) {
//        System.out.println("Error: " + o.getMessage());
//        } catch (IOException ex) {
//            System.out.println("Error writing to file: " + ex.getMessage());
//        } 
//            });
//         sencelayoutaddvet.getChildren().addAll(vetid,vetId,vetName,vetName1,addvetdata);
//          Scene sceneaddvet = new Scene(sencelayoutaddvet,300,200);
//         addvet.setOnAction(e->{
//         primaryStage.setScene(sceneaddvet);
//         
//         });
//edit vet scene
//           VBox editvetscence = new VBox(10);
//           Label newvetId  = new Label(" new vet ID:");
//           TextField newvetiddata = new TextField();
//           
//           Label  newvetname = new Label(" new Name:");
//           TextField newvetnamedata = new TextField();
//           
//           Label oldvetId = new Label(" current vet  id");
//           TextField oldvetIddata = new TextField();
//           
//           Button editvetdata = new Button("Add  new vet");
//           
//           editvetdata.setOnAction(e -> {           
//            File file = new File("veterinarian.txt");
//        if (file.exists()) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] parts = line.split(", ");
//                    int id = Integer.parseInt(parts[0].split(": ")[1]);
//                    String name = parts[1].split(": ")[1];
//                    veterinarian.put(id, name);
//                }
//            } catch (IOException p) {
//                System .out.println("Error reading from file: " + p.getMessage());
//            }
//            }
//               try {                  
//                int newID = Integer.parseInt(newvetiddata.getText());
//                String newName = newvetnamedata.getText();
//                int oldID = Integer.parseInt(oldvetIddata.getText());
//
//                if (veterinarian.isEmpty()) {
//                    throw new IllegalArgumentException("The map is empty");
//                }
//
//                if (!veterinarian.containsKey(oldID)) {
//                    throw new IllegalArgumentException("veterinarian with ID " + oldID + " does not exist.");
//                }
// Remove the old entry and add the new one
//                veterinarian.remove(oldID);
//                veterinarian.put(newID, newName);
//               System.out.println("Updated veterinarian ID " + oldID + " to new ID " + newID + " with name " + newName);
//
// Write updated data back to the file                
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veterinarian.txt"))) {
//            for (Map.Entry<Integer, String> entry : veterinarian.entrySet()) {
//                writer.write("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//                writer.newLine();
//            }
//        }
// Clear input fields
//                newvetiddata.clear();
//                newvetnamedata.clear();
//                oldvetIddata.clear();
//            } catch (IllegalArgumentException l) {
//                System.out.println("An error occurred: " + l.getMessage());
//            } catch (IOException ex) {
//                System.out.println("Error writing to file: " + ex.getMessage());
//            }
//        });
//        editvetscence.getChildren().addAll(newvetId, newvetiddata, newvetname, newvetnamedata, oldvetId, oldvetIddata, editvetdata);
//        Scene sceneEditvet = new Scene(editvetscence, 300, 200);
// Button to switch to the edit pet scene
//        editvet.setOnAction(e -> {
//            primaryStage.setScene(sceneEditvet);
//        });
// remove vet secne             
//            VBox removevetlayout = new VBox(10);
//            Label  vetidremove = new Label(" Enter Pet ID to Remove :");
//            TextField textField7 = new TextField();
//            Button removevetdata = new Button(" remove vet ");
//            
//           removevetdata.setOnAction(e->{
//        try {
//                int ID2 = Integer.parseInt(textField7.getText());
//                File file = new File("veterinarian.txt");
//            if (file.exists()) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(", ");
//                int id = Integer.parseInt(parts[0].split(": ")[1]); 
//                String name = parts[1].split(": ")[1]; 
//                veterinarian.put(id, name); 
//            }
//        } catch (IOException ex) {
//                System.out.println("Error reading from file: " + ex.getMessage());
//            }
//            }            
//        if(veterinarian.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//        }
//        if(!veterinarian.containsKey(ID2)){
//             throw new IllegalArgumentException("veterinarian with ID " + ID2 + " does not exist.");
//            }            
//            veterinarian.remove(ID2);
//            System.out.println("ID = " + ID2 + "removed");
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veterinarian.txt"))) {
//                    for (Map.Entry<Integer, String> entry : veterinarian.entrySet()) {
//                        writer.write("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//                        writer.newLine();
//                    }
//                   
//                } catch (IOException ex) {
//                    System.out.println("Error writing to file: " + ex.getMessage());
//                }       
//                textField7.clear();
//             }catch (NumberFormatException ex) {
//                System.out.println("Error: Please enter a valid number.");
//            } catch (IllegalArgumentException u) {
//                System.out.println("Error: " + u.getMessage());
//            }            
//           });
//            removevetlayout.getChildren().addAll(vetidremove,textField7,removevetdata);
//            Scene removevetscene = new Scene(removevetlayout,300,200);
//            removevet.setOnAction(e->{
//            primaryStage.setScene(removevetscene);                
//            });
//list vet scene
//            VBox listvetlayout = new VBox(10);
//            Button displayveterinarianButton = new Button("Display veterinarian");
//        displayveterinarianButton.setOnAction(e -> {
//             try{
//                 File file = new File("veterinarian.txt");
//        if (file.exists()) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] parts = line.split(", ");
//                    int id = Integer.parseInt(parts[0].split(": ")[1]);
//                    String name = parts[1].split(": ")[1]; 
//                    veterinarian.put(id, name); 
//                }
//            }
//        }else {
//            throw new FileNotFoundException("File does not exist: " );
//        }                 
//        if(veterinarian.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//            }            
//            for (Map.Entry<Integer, String> entry : veterinarian.entrySet()) {
//                    String displayText = "veterinarian ID: " + entry.getKey() + ", Name: " + entry.getValue();
//                    Label label = new Label(displayText); 
//                    listvetlayout.getChildren().add(label);
//                }                                
//                } catch (IllegalArgumentException ex) {
//                System.out.println("An error occurred: " + ex.getMessage());
//             } catch (IOException ex) {
//                System.out.println("Error reading from file: " + ex.getMessage());
//             }
//        });        
//        listvetlayout.getChildren().addAll(displayveterinarianButton);
//         Scene listvetscene = new Scene(listvetlayout,300,200);
//        listevet.setOnAction(e->{
//                primaryStage.setScene(listvetscene);
//            });
//send reminder
//        VBox SendReminderlayout = new VBox(10);
//        Button reminderButton = new Button("Send Reminder");
//        TextArea outputArea = new TextArea();
//        reminderButton.setOnAction(e -> {
//      try {
//            if (appointments.isEmpty()) {
//                outputArea.appendText("No appointments to remind.\n");
//                return;
//            }
//
//            StringBuilder reminders = new StringBuilder("Reminders for upcoming appointments:\n");
//            for (String appointment : appointments) {
//                reminders.append(appointment).append("\n");
//            }
// Display reminders in the TextArea
//            outputArea.appendText(reminders.toString());
//        } catch (Exception eo) {
//            outputArea.appendText("An error occurred while sending reminders: " + eo.getMessage() + "\n");
//        }         
//        });   
//        SendReminderlayout.getChildren().add(reminderButton);
//        Scene reminderScene = new Scene(SendReminderlayout, 300, 200);
//        Reminder.setOnAction(e->{
//        primaryStage.setScene(reminderScene);        
//        });
//    }
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//import javafx.application.Application;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import static javafx.application.Application.launch;
//import javafx.geometry.Insets;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public Map<Integer, String> petowner = new HashMap<>();
//public Map<Integer, String> veterinarian = new HashMap<>();
//public Map<Integer, HealthRecord> ListOfHealthRecord = new HashMap<>();
//public Map<Integer, Prescription> ListOfPrescricption = new HashMap<>();
//public Map<Integer, PetTreatmentHistory> Listtreatmenthistory= new HashMap<>();
//public ArrayList<String> appointments= new ArrayList<>();  
//    @Override
//    public void start(Stage primaryStage) {
//admin scene
//        VBox sencelayoutadmin = new VBox(10);
//        TextField IDtextfeild = new TextField();
//        Label labeladminid = new Label("ID:");
//        Button signIn = new Button("SIGN IN");
// 
//        sencelayoutadmin.getChildren().addAll(labeladminid,IDtextfeild,signIn);
//        Scene sceneadmin = new Scene(sencelayoutadmin,300,200);                
//user scene
//         GridPane userLayout = new GridPane();
//        userLayout.setPadding(new Insets(20)); // Set padding around the grid
//        userLayout.setVgap(10); // Set vertical gap between rows
//        userLayout.setHgap(10); // Set horizontal gap between columns
//        userLayout.setAlignment(Pos.CENTER); // Center the grid in the scene
//         Label vetLabel = new Label("Vet");
//      Label petLabel = new Label("Pet");
//         Button addPetButton = new Button("Add Pet");
//        Button editPetButton = new Button("Edit Pet Data");
//        Button removePetButton = new Button("Remove Pet Data");
//        Button listPetButton = new Button("List All Pets");
//        Button addVetButton = new Button("Add Vet");
//        Button editVetButton = new Button("Edit Vet Data");
//        Button removeVetButton = new Button("Remove Vet Data");
//        Button listVetButton = new Button("List All Vets");
//        Button reminderButton = new Button("Reminder");
//        Button manageButton = new Button("Manage");
//        Button prescriptionsButton = new Button("Prescriptions");
//
//         Add components to the GridPane
//        userLayout.add(vetLabel, 0, 0); // Column 0, Row 0
//        userLayout.add(petLabel, 1, 0); // Column 1, Row 0
//        userLayout.add(addPetButton, 0, 1); // Column 0, Row 1
//        userLayout.add(editPetButton, 1, 1); // Column 1, Row 1
//        userLayout.add(removePetButton, 0, 2); // Column 0, Row 2
//        userLayout.add(listPetButton, 1, 2); // Column 1, Row 2
//        userLayout.add(addVetButton, 0, 3); // Column 0, Row 3
//        userLayout.add(editVetButton, 1, 3); // Column 1, Row 3
//        userLayout.add(removeVetButton, 0, 4); // Column 0, Row 4
//        userLayout.add(listVetButton, 1, 4); // Column 1, Row 4
//        userLayout.add(reminderButton, 0, 5); // Column 0, Row 5
//        userLayout.add(manageButton, 1, 5); // Column 1, Row 5
//        userLayout.add(prescriptionsButton, 0, 6, 2, 1); // Span across two columns in Row 6
//     Scene sceneUser  = new Scene(userLayout, 400, 300);
//
//  add pet
//            VBox sencelayoutaddpet = new VBox(10);
//            Label petid = new Label(" Enter Pet ID:");
//            TextField petId  = new TextField();
//            Label petNmae = new Label(" Enter Pet Name:");
//            TextField petName = new TextField(); 
//            Button addPet = new Button("Add Pet Data ");
//            addPet.setOnAction(e->{
//        try {
//            int ID = Integer.parseInt(petId.getText());   
//            String name = petName.getText();
//        if (petowner.containsKey(ID)) {
//            throw new IllegalArgumentException("Pet owner with ID " + ID + " already exists.");
//        }
//            File file = new File("petowners.txt");
//        if (!file.exists()) {
//            file.createNewFile(); 
//        }
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("petowners.txt", true))) {
//            writer.write("ID: " + ID + ", Name: " + name);
//            writer.newLine();
//        }
//            petowner.put(ID, name);
//            System.out.println("ID = " + ID + ", Name = " + name);
//            petId.clear();
//            petName.clear();  
//        }catch (IllegalArgumentException o) {
//            System.out.println("Error: " + o.getMessage());
//        }catch (IOException ex) {
//            System.out.println("Error writing to file: " + ex.getMessage());
//        }
//    });
//           sencelayoutaddpet.getChildren().addAll(petid,petId,petNmae,petName,addPet);
//           Scene sceneaddpet = new Scene(sencelayoutaddpet,300,200);
//           addPetButton.setOnAction(e->{
//           primaryStage.setScene(sceneaddpet); 
//    });         
//edit pet scene
//           VBox editpetscence = new VBox(10);
//           Label newpetId  = new Label(" new  pet ID:");
//           TextField newpetiddata = new TextField();
//           
//           Label  newpetname = new Label(" new Name:");
//           TextField newpetnamedata = new TextField();
//           
//           Label oldPetId = new Label(" current pet  id");
//           TextField oldPetIddata = new TextField();
//           
//           Button editPetdata = new Button("Add  new PET");
//           
//           editPetdata.setOnAction(e -> {           
//            File file = new File("petowners.txt");
//        if (file.exists()) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] parts = line.split(", ");
//                    int id = Integer.parseInt(parts[0].split(": ")[1]);
//                    String name = parts[1].split(": ")[1];
//                    petowner.put(id, name);
//                }
//            } catch (IOException p) {
//                System .out.println("Error reading from file: " + p.getMessage());
//            }
//            }
//               try {                  
//                int newID = Integer.parseInt(newpetiddata.getText());
//                String newName = newpetnamedata.getText();
//                int oldID = Integer.parseInt(oldPetIddata.getText());
//                if (petowner.isEmpty()) {
//                    throw new IllegalArgumentException("The map is empty");
//                }
//                if (!petowner.containsKey(oldID)) {
//                    throw new IllegalArgumentException("Pet owner with ID " + oldID + " does not exist.");
//                }
// Remove the old entry and add the new one
//                petowner.remove(oldID);
//                petowner.put(newID, newName);
//                System.out.println("Updated pet owner ID " + oldID + " to new ID " + newID + " with name " + newName);
//
// Write updated data back to the file                
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("petowners.txt"))) {
//            for (Map.Entry<Integer, String> entry : petowner.entrySet()) {
//                writer.write("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//                writer.newLine();
//            }
//        }
// Clear input fields
//                newpetiddata.clear();
//                newpetnamedata.clear();
//                oldPetIddata.clear();
//            } catch (IllegalArgumentException l) {
//                System.out.println("An error occurred: " + l.getMessage());
//            } catch (IOException ex) {
//                System.out.println("Error writing to file: " + ex.getMessage());
//            }
//        });
//
//editpetscence.getChildren().addAll(newpetId, newpetiddata, newpetname, newpetnamedata, oldPetId, oldPetIddata, editPetdata);
//        Scene sceneEditPet = new Scene(editpetscence, 300, 200);
// Button to switch to the edit pet scene
//        editPetButton.setOnAction(e -> {
//            primaryStage.setScene(sceneEditPet);
//        });
//remove pet secne             
//            VBox removepetlayout = new VBox(10);
//            Label  petidremove = new Label(" Enter Pet ID to Remove :");
//            TextField textField6 = new TextField();
//            Button removepetdata = new Button(" remove pet ");
//            
//           removepetdata.setOnAction(e->{
//        try {
//                int ID1 = Integer.parseInt(textField6.getText());
//                File file = new File("petowners.txt");
//            if (file.exists()) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(", ");
//                int id = Integer.parseInt(parts[0].split(": ")[1]); 
//                String name = parts[1].split(": ")[1]; 
//                petowner.put(id, name); 
//            }
//        } catch (IOException ex) {
//                System.out.println("Error reading from file: " + ex.getMessage());
//            }
//            }            
//        if(petowner.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//        }
//        if(!petowner.containsKey(ID1)){
//             throw new IllegalArgumentException("Pet owner with ID " + ID1 + " does not exist.");
//            }            
//            petowner.remove(ID1);
//            System.out.println("ID = " + ID1 + "removed");    
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("petowners.txt"))) {
//                    for (Map.Entry<Integer, String> entry : petowner.entrySet()) {
//                        writer.write("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//                        writer.newLine();
//                    }
//                    
//                } catch (IOException ex) {
//                    System.out.println("Error writing to file: " + ex.getMessage());
//                }       
//                textField6.clear();
//             }catch (NumberFormatException ex) {
//                System.out.println("Error: Please enter a valid number.");
//            } catch (IllegalArgumentException u) {
//                System.out.println("Error: " + u.getMessage());
//            }            
//           });
//            removepetlayout.getChildren().addAll(petidremove,textField6,removepetdata);
//            Scene removepetscene = new Scene(removepetlayout,300,200);
//            removePetButton.setOnAction(e->{
//            primaryStage.setScene(removepetscene);                
//            });
//list pet scene
//            VBox listpetlayout = new VBox(10);
//            Button displayPetOwnersButton = new Button("Display Pet Owners");
//        displayPetOwnersButton.setOnAction(e -> {
//             try{
//                 File file = new File("petowners.txt");
//        if (file.exists()) {
//            try (BufferedReader reader = new BufferedReader(new FileReader("petowners.txt"))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] parts = line.split(", ");
//                    int id = Integer.parseInt(parts[0].split(": ")[1]);
//                    String name = parts[1].split(": ")[1]; 
//                    petowner.put(id, name); 
//                }
//            }
//        }else {
//            throw new FileNotFoundException("File does not exist:");
//        }                 
//        if(petowner.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//            }            
//            for (Map.Entry<Integer, String> entry : petowner.entrySet()) {
//                    String displayText = "Pet Owner ID: " + entry.getKey() + ", Name: " + entry.getValue();
//                    Label label = new Label(displayText); 
//                    listpetlayout.getChildren().add(label);
//                }                                
//                } catch (IllegalArgumentException ex) {
//                System.out.println("An error occurred: " + ex.getMessage());
//             } catch (IOException ex) {
//                System.out.println("Error reading from file: " + ex.getMessage());
//             }
//        });        
//        listpetlayout.getChildren().addAll(displayPetOwnersButton);
//         Scene listpetscene = new Scene(listpetlayout,300,200);
//        listPetButton.setOnAction(e->{
//                primaryStage.setScene(listpetscene);
//            });
//        
//add vet scene 
//           VBox sencelayoutaddvet  = new VBox(10);
//           Label vetid = new Label(" Enter Vet ID:");
//           TextField vetId  = new TextField();
//           Label vetName = new Label(" Enter Vet Name:");
//           TextField vetName1 = new TextField(); 
//           Button addvetdata = new Button("Add Vet Data ");
//           
//           addvetdata.setOnAction(e->{
//        try {
//            int ID = Integer.parseInt(vetId.getText());   
//            String name = vetName.getText();
//        if (veterinarian.containsKey(ID)){
//            throw new IllegalArgumentException("veterinarian with ID " + ID + " already exists.");
//        }
//            File file = new File("veterinarian.txt");
//        if (!file.exists()) {
//            file.createNewFile(); 
//        }
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veterinarian.txt", true))) {
//            writer.write("ID: " + ID + ", Name: " + name);
//            writer.newLine();
//        }
//            veterinarian.put(ID, name);
//            System.out.println("ID = " + ID + ", Name = " + name);
//
//            vetId.clear();
//            vetName1.clear();  
//      }catch (IllegalArgumentException o) {
//        System.out.println("Error: " + o.getMessage());
//        } catch (IOException ex) {
//            System.out.println("Error writing to file: " + ex.getMessage());
//        } 
//            });
//         sencelayoutaddvet.getChildren().addAll(vetid,vetId,vetName,vetName1,addvetdata);
//          Scene sceneaddvet = new Scene(sencelayoutaddvet,300,200);
//         addVetButton .setOnAction(e->{
//         primaryStage.setScene(sceneaddvet);
//         
//         });
//edit vet scene
//           VBox editvetscence = new VBox(10);
//           Label newvetId  = new Label(" new vet ID:");
//           TextField newvetiddata = new TextField();
//           
//           Label  newvetname = new Label(" new Name:");
//           TextField newvetnamedata = new TextField();
//           
//           Label oldvetId = new Label(" current vet  id");
//           TextField oldvetIddata = new TextField();
//           
//           Button editvetdata = new Button("Add  new vet");
//           
//           editvetdata.setOnAction(e -> {           
//            File file = new File("veterinarian.txt");
//        if (file.exists()) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] parts = line.split(", ");
//                    int id = Integer.parseInt(parts[0].split(": ")[1]);
//                    String name = parts[1].split(": ")[1];
//                    veterinarian.put(id, name);
//                }
//            } catch (IOException p) {
//                System .out.println("Error reading from file: " + p.getMessage());
//            }
//            }
//               try {                  
//                int newID = Integer.parseInt(newvetiddata.getText());
//                String newName = newvetnamedata.getText();
//                int oldID = Integer.parseInt(oldvetIddata.getText());
//
//                if (veterinarian.isEmpty()) {
//                    throw new IllegalArgumentException("The map is empty");
//                }
//
//                if (!veterinarian.containsKey(oldID)) {
//                    throw new IllegalArgumentException("veterinarian with ID " + oldID + " does not exist.");
//                }
// Remove the old entry and add the new one
//                veterinarian.remove(oldID);
//                veterinarian.put(newID, newName);
//               System.out.println("Updated veterinarian ID " + oldID + " to new ID " + newID + " with name " + newName);
//
// Write updated data back to the file                
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veterinarian.txt"))) {
//            for (Map.Entry<Integer, String> entry : veterinarian.entrySet()) {
//                writer.write("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//                writer.newLine();
//            }
//        }
// Clear input fields
//                newvetiddata.clear();
//                newvetnamedata.clear();
//                oldvetIddata.clear();
//            } catch (IllegalArgumentException l) {
//                System.out.println("An error occurred: " + l.getMessage());
//            } catch (IOException ex) {
//                System.out.println("Error writing to file: " + ex.getMessage());
//            }
//        });
//        editvetscence.getChildren().addAll(newvetId, newvetiddata, newvetname, newvetnamedata, oldvetId, oldvetIddata, editvetdata);
//        Scene sceneEditvet = new Scene(editvetscence, 300, 200);
// Button to switch to the edit pet scene
//        editVetButton .setOnAction(e -> {
//            primaryStage.setScene(sceneEditvet);
//        });
// remove vet secne             
//            VBox removevetlayout = new VBox(10);
//            Label  vetidremove = new Label(" Enter Pet ID to Remove :");
//            TextField textField7 = new TextField();
//            Button removevetdata = new Button(" remove vet ");
//            
//           removevetdata.setOnAction(e->{
//        try {
//                int ID2 = Integer.parseInt(textField7.getText());
//                File file = new File("veterinarian.txt");
//            if (file.exists()) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(", ");
//                int id = Integer.parseInt(parts[0].split(": ")[1]); 
//                String name = parts[1].split(": ")[1]; 
//                veterinarian.put(id, name); 
//            }
//        } catch (IOException ex) {
//                System.out.println("Error reading from file: " + ex.getMessage());
//            }
//            }            
//        if(veterinarian.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//        }
//        if(!veterinarian.containsKey(ID2)){
//             throw new IllegalArgumentException("veterinarian with ID " + ID2 + " does not exist.");
//            }            
//            veterinarian.remove(ID2);
//            System.out.println("ID = " + ID2 + "removed");
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veterinarian.txt"))) {
//                    for (Map.Entry<Integer, String> entry : veterinarian.entrySet()) {
//                        writer.write("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//                        writer.newLine();
//                    }
//                   
//                } catch (IOException ex) {
//                    System.out.println("Error writing to file: " + ex.getMessage());
//                }       
//                textField7.clear();
//             }catch (NumberFormatException ex) {
//                System.out.println("Error: Please enter a valid number.");
//            } catch (IllegalArgumentException u) {
//                System.out.println("Error: " + u.getMessage());
//            }            
//           });
//            removevetlayout.getChildren().addAll(vetidremove,textField7,removevetdata);
//            Scene removevetscene = new Scene(removevetlayout,300,200);
//            removeVetButton .setOnAction(e->{
//            primaryStage.setScene(removevetscene);                
//            });
//list pet scene
//            VBox listvetlayout = new VBox(10);
//            Button displayveterinarianButton = new Button("Display veterinarian");
//        displayveterinarianButton.setOnAction(e -> {
//             try{
//                 File file = new File("veterinarian.txt");
//        if (file.exists()) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] parts = line.split(", ");
//                    int id = Integer.parseInt(parts[0].split(": ")[1]);
//                    String name = parts[1].split(": ")[1]; 
//                    veterinarian.put(id, name); 
//                }
//            }
//        }else {
//            throw new FileNotFoundException("File does not exist: " );
//        }                 
//        if(veterinarian.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//            }            
//            for (Map.Entry<Integer, String> entry : veterinarian.entrySet()) {
//                    String displayText = "veterinarian ID: " + entry.getKey() + ", Name: " + entry.getValue();
//                    Label label = new Label(displayText); 
//                    listvetlayout.getChildren().add(label);
//                }                                
//                } catch (IllegalArgumentException ex) {
//                System.out.println("An error occurred: " + ex.getMessage());
//             } catch (IOException ex) {
//                System.out.println("Error reading from file: " + ex.getMessage());
//             }
//        });        
//        listvetlayout.getChildren().addAll(displayveterinarianButton);
//         Scene listvetscene = new Scene(listvetlayout,300,200);
//        listVetButton .setOnAction(e->{
//                primaryStage.setScene(listvetscene);
//            });
//        
//            
//       send reminder
//        VBox SendReminderlayout = new VBox(10);
//        Button reminderButton2 = new Button("Send Reminder");
//        TextArea outputArea = new TextArea();
//        reminderButton2.setOnAction(e -> {
//      try {
//            if (appointments.isEmpty()) {
//                outputArea.appendText("No appointments to remind.\n");
//                return;
//            }
//
//            StringBuilder reminders = new StringBuilder("Reminders for upcoming appointments:\n");
//            for (String appointment : appointments) {
//                reminders.append(appointment).append("\n");
//            }
// Display reminders in the TextArea
//            outputArea.appendText(reminders.toString());
//        } catch (Exception eo) {
//            outputArea.appendText("An error occurred while sending reminders: " + eo.getMessage() + "\n");
//        }         
//        });   
//        SendReminderlayout.getChildren().add(reminderButton);
//        Scene reminderScene = new Scene(SendReminderlayout, 300, 200);
//        reminderButton .setOnAction(e->{
//        primaryStage.setScene(reminderScene);        
//        });
//       
//    manage vet 
//         VBox vetmangelayout = new VBox(10);
//          Button addvetrecordb = new Button(" Add Vet Record");
//           Button updatevetrecordb = new Button("UPdate Vet Record");
//          Button displayvetrecordb = new Button("Display Record");
//          vetmangelayout.getChildren().addAll(addvetrecordb,updatevetrecordb,displayvetrecordb);
//          Scene mangescene= new Scene(vetmangelayout,300,200);
//            manageButton .setOnAction(e->{
//                  
//                   primaryStage.setScene(mangescene);
//            });
//             add pet record description
//            
//                VBox vetdescriptionlayout = new VBox(10);
//         Label recordID = new Label("recordID:");
//              TextField recordIData = new TextField(); 
//              Label vetID = new Label("petID:");
//              TextField vetIDData = new TextField(); 
//              Label description = new Label("description:");
//              TextField descriptionData = new TextField(); 
//          Button addvetrecord = new Button("Save Record");
//          Button backaddddata = new Button("back");
//        
//        addvetrecord.setOnAction(event -> {                  
//                try {
//               int  RecordID = Integer.parseInt(recordIData.getText());
//                 int vetiDData = Integer.parseInt(vetIDData.getText());
//              String  Description = descriptionData.getText();
//                
//                HealthRecord newHealthRecord2 = new HealthRecord(RecordID, vetiDData, Description);
//                ListOfHealthRecord.put(RecordID, newHealthRecord2);
//             
//                recordIData.clear();
//                vetIDData.clear();
//                descriptionData.clear();
//                                System.out.println("Health record added: " + newHealthRecord2);
//
// File file = new File("vetdata.txt");
//        if (!file.exists()) {
//            file.createNewFile(); 
//        }
//         try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
//            writer.write("ID: " + RecordID + " pet ID: " + vetiDData + " Description: " + Description);
//            writer.newLine();
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + e.getMessage());
//        }
//
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter valid numbers for record ID and pet ID.");
//            } catch (IOException ex) {
//                Logger.getLogger(NewFXMain.class.getName()).log(Level.SEVERE, null, ex);
//            }
//              
//            });
//        backaddddata.setOnAction(e->{
//     primaryStage.setScene(mangescene);
//    
//});
//        
//         vetdescriptionlayout.getChildren().addAll(recordID,recordIData,vetID,vetIDData,description,descriptionData,addvetrecord,backaddddata);
//          Scene scenedescriptionvet = new Scene(vetdescriptionlayout,300,200);
//           addvetrecordb.setOnAction(e->{
//          primaryStage.setScene(scenedescriptionvet);
//         });
//  Update pet Description
//            VBox vetupdatedlayout = new VBox(10);
//Label updatedrecordID = new Label(" Record ID:");
//TextField updatedrecordIDField = new TextField(); 
//Label updatedvetID = new Label("Updated pet ID:");
//TextField updatedpetIDData = new TextField();
//Label updateddescription = new Label("Updated Description:");
//TextField updateddescriptionData = new TextField();
//Button saveupdateddata = new Button("Save Updated Record");
//Button backupdateddata = new Button("back");
//
//
//saveupdateddata.setOnAction(p -> {
//    try {
//       
//        int updatedRecordID = Integer.parseInt(updatedrecordIDField.getText());
//        if (!ListOfHealthRecord.containsKey(updatedRecordID)) {
//            System.out.println("The ID is not found in the database. Wrong record ID.");
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Error");
//            alert.setHeaderText("Record Not Found");
//            alert.setContentText("The ID is not found in the database. Please enter a valid record ID.");
//            alert.showAndWait();
//            return; 
//        }
//        int updatedPetID = Integer.parseInt(updatedpetIDData.getText());
//        String updatedDescription = updateddescriptionData.getText();
//         HealthRecord existingRecord = ListOfHealthRecord.get(updatedRecordID);
//
//                 Update the existing record with the new values
//                existingRecord.setPetID(updatedPetID);
//                existingRecord.setDescription(updatedDescription);
//
//                 Update the HashMap
//                ListOfHealthRecord.put(updatedRecordID, existingRecord);
//        saveToFile();
//        updatedrecordIDField.clear();
//        updatedpetIDData.clear();
//        updateddescriptionData.clear();
//
//        System.out.println("Health record updated: " + existingRecord);
//    } catch (NumberFormatException e) {
//        System.out.println("Error: Please enter valid numbers for record ID and pet ID.");
//    }
//});
//backupdateddata.setOnAction(e->{
//     primaryStage.setScene(mangescene);
//    
//});
//
//              
//           vetupdatedlayout.getChildren().addAll(updatedrecordID,updatedrecordIDField,updatedvetID,updatedpetIDData,updateddescription,updateddescriptionData,saveupdateddata,backupdateddata);
//          Scene sceneupdateddescriptionvet = new Scene(vetupdatedlayout,300,200);
//               display vetdata 
//                      displayvetrecordb.setOnAction(m->{
//         File file = new File("vetdata.txt");
//        if (!file.exists()) {
//        try {
//           throw new FileNotFoundException("File not found: " + "vetdata.txt");
//        } catch (FileNotFoundException ex) {
//           Logger.getLogger(NewFXMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        }
//         try (BufferedReader reader = new BufferedReader(new FileReader("vetdata.txt"))) {
//        String line;
//        System.out.println(" vet data  from file:");
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//        } catch (IOException e) {
//            System.err.println("An error occurred while reading the file: " + e.getMessage());
//        }
//              });
//
//           updatevetrecordb.setOnAction(e->{
//                 primaryStage.setScene(sceneupdateddescriptionvet);
//           });
//            
//             Prescriptions 
//VBox Prescriptionslayout = new VBox(10);
//  Button addPrescriptions= new Button(" Add Prescriptions");
//  Button UpdatePrescriptions= new Button(" Update Prescriptions");
//    Button viewPrescriptions= new Button(" view Prescriptions");
//
//   Prescriptionslayout.getChildren().addAll(addPrescriptions,UpdatePrescriptions,viewPrescriptions);
//      Scene scenePrescriptions = new Scene(Prescriptionslayout,300,200);
//          prescriptionsButton.setOnAction(e->{
//            primaryStage.setScene(scenePrescriptions);
//           });
//      
//            scene add Prescriptions
//           VBox Prescriptionslayoutadd = new VBox(10);
//           Label presciptionid = new Label("presciption ID");
//      TextField presciptioniddata = new TextField(); 
//              Label petID3 = new Label("petID:");
//              TextField petIDData3 = new TextField(); 
//              Label instruction = new Label("instruction:");
//              TextField instructiondata = new TextField(); 
//               Button saveButtonPrescriptions = new Button("Save Record");
//                Button backp = new Button("Back");
//          saveButtonPrescriptions.setOnAction(event -> {                  
//                try {
//                int presciptionId = Integer.parseInt(presciptioniddata.getText());
//                int PetID = Integer.parseInt(petIDData3.getText());
//                String Instruction = instructiondata.getText();
//                Prescription Prescription2 = new Prescription(presciptionId, PetID, Instruction);
//                ListOfPrescricption.put(presciptionId, Prescription2);
//                presciptioniddata.clear();
//                petIDData3.clear();
//                instructiondata.clear();
//
//                System.out.println("Prescription record added: " + Prescription2);
//               File file2 = new File("presciptionid.txt");
//        if (!file2.exists()) {
//            file2.createNewFile(); 
//        }
//       try(BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true))){
//            writer.write(" presciption ID: " + presciptionId + " pet ID: " + PetID + " Instruction: " + Instruction);
//            writer.newLine();
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + e.getMessage());
//        }
//
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter valid numbers for record ID and pet ID.");
//            } catch (IOException ex) {
//                System.out.println("error");
//            } 
//          });
//           Prescriptionslayoutadd.getChildren().addAll(presciptionid,presciptioniddata,petID3,petIDData3,instruction,instructiondata,saveButtonPrescriptions,backp);
//            Scene scenePrescriptionsadd = new Scene(Prescriptionslayoutadd,300,200);
//         addPrescriptions.setOnAction(e->{
//         primaryStage.setScene(scenePrescriptionsadd);
//         
//         
//         });
//         backp.setOnAction(e->{
//                primaryStage.setScene(scenePrescriptions);
//         });
//       
//         update prescaraption scene 
//
//           VBox Prescriptionslayoutupdate = new VBox(10);
//    Label updatedpresciptionId = new Label(" updated recordID:");
//    TextField updatedpresciptionIdfileld = new TextField(); 
//              Label updatedpetID = new Label("updated petID:");
//              TextField updatedpetIDData2 = new TextField(); 
//              Label updatedinstruation = new Label("updated instraction:");
//              
//              TextField updatedinstrucationData = new TextField(); 
//          Button saveButtonupdate = new Button("Save Record");
//            Button backpupdate = new Button("Back");
//              saveButtonupdate.setOnAction(n -> {                  
//                try {
//                    
//                 int data1=Integer.parseInt(updatedpresciptionIdfileld.getText());
//              if (! ListOfPrescricption.containsKey(data1) ){
//             System.out.println("the id is not found in the data base wrong record id ");
//             Alert alert = new Alert(Alert.AlertType.ERROR);
//                        alert.setTitle("Error");
//                        alert.setHeaderText("Record Not Found");
//                        alert.setContentText("The ID is not found in the database. Please enter a valid record ID.");
//                        alert.showAndWait();
//             }
//  int UpdatedpetID = Integer.parseInt(updatedpetIDData2.getText());    
//                String Updatedinstrucation = updatedinstrucationData.getText();
//  Prescription existingprecrpation = ListOfPrescricption.get(data1);
//
//                 Update the existing record with the new values
//                existingprecrpation.setPetID(UpdatedpetID);
//                existingprecrpation.setInstruction(Updatedinstrucation);
//
//                 Update the HashMap
//                ListOfPrescricption.put(data1, existingprecrpation);
//             
//               
//               
//                 File file = new File("prescriptions.txt");
//                if (!file.exists()) {
//                    file.createNewFile(); // Create the file if it doesn't exist
//                }
//
//                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
//                    writer.write("Prescription ID: " + existingprecrpation.getPresciptionid() +
//                            ", Pet ID: " + existingprecrpation.getPetID() +
//                            ", Instruction: " + existingprecrpation.getInstruction());
//                    writer.newLine();
//                }
//
//                updatedpresciptionIdfileld.clear();
//                updatedpetIDData2.clear();
//                updatedinstrucationData.clear();
//
//                System.out.println(" Prescription UPdated: " + existingprecrpation);
//               
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter valid numbers for record ID and pet ID.");
//            } catch (IOException ex) {
//             System.out.println("Error: Please enter valid numbers for record ID and pet ID.");
//
//            }
//              });
//               Prescriptionslayoutupdate.getChildren().addAll(updatedpresciptionId,updatedpresciptionIdfileld,updatedpetID,updatedpetIDData2,updatedinstruation,updatedinstrucationData,saveButtonupdate,backpupdate);
//            Scene scenePrescriptionsupdate = new Scene(Prescriptionslayoutupdate,300,200);
//              UpdatePrescriptions.setOnAction(e->{
//                   primaryStage.setScene(scenePrescriptionsupdate);
//              });
//              backpupdate.setOnAction(e->{
//                primaryStage.setScene(mangescene);
//         });
//               view prectrption screne 
//                 viewPrescriptions.setOnAction(m->{
//         File file = new File("presciptionid.txt");
//        if (!file.exists()) {
//        try {
//           throw new FileNotFoundException("File not found: " + "presciptionid.txt");
//        } catch (FileNotFoundException ex) {
//           Logger.getLogger(NewFXMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        }
//         try (BufferedReader reader = new BufferedReader(new FileReader("presciptionid.txt"))) {
//        String line;
//        System.out.println(" presciptionid data  from file:");
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//        } catch (IOException e) {
//            System.err.println("An error occurred while reading the file: " + e.getMessage());
//        }
//              });
//      
//               signIn.setOnAction(e->{
//        primaryStage.setScene(sceneUser);
//        });
//        primaryStage.setTitle("Pet Care System");
//        primaryStage.setScene(sceneadmin);
//        primaryStage.show();
//            
//    }
//           public static void main(String[] args) {
//        launch(args);
//    }   
//private void saveToFile() {
//    File file = new File("vetdata.txt");
//    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
//        for (HealthRecord record : ListOfHealthRecord.values()) {
//            writer.write("ID: " + record.getRecordID() +
//                         " pet ID: " + record.getPetID() +
//                         " Description: " + record.getDescription());
//            writer.newLine();
//        }
//    } catch (IOException e) {
//        System.out.println("Error saving to file: " + e.getMessage());
//    }
//}
//}