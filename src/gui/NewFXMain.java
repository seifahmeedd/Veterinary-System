package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class NewFXMain extends Application {    
  @Override
    public void start(Stage primaryStage) {}

    public static void main(String[] args) {
        launch(args);}}

//if the entered number is between 2 and 50 it will open veterinarian page.
//    Button manage= new Button("manage");
//    manage.setOnAction(g -> {
//            Button addRecord = new Button("ADD Record");
//            addRecord.setOnAction(k -> {
//                Label recordID = new Label("recordID:");
//              TextField recordIData = new TextField(); 
//              Label petID = new Label("petID:");
//              TextField petIDData = new TextField(); 
//              Label description = new Label("description:");
//              TextField descriptionData = new TextField(); 
//            VBox record = new VBox(20,recordID,recordIData,petID,petIDData,description,descriptionData);
//                Stage recordStage = new Stage();
//        recordStage.setTitle("Add Health Record");
//        recordStage.setScene(new Scene(record, 300, 200));
//        recordStage.show();
//        Button saveButton = new Button("Save Record");
//        saveButton.setOnAction(event -> {                  
//                try {
//                int RecordID = Integer.parseInt(recordIData.getText());
//                int PetID = Integer.parseInt(petIDData.getText());
//                String Description = descriptionData.getText();
//                HealthRecord newHealthRecord2 = new HealthRecord(RecordID, PetID, Description);
//                ListOfHealthRecord.put(RecordID, newHealthRecord2);
//                recordIData.clear();
//                petIDData.clear();
//                descriptionData.clear();
//
//                System.out.println("Health record added: " + newHealthRecord2);
//                recordStage.close();
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter valid numbers for record ID and pet ID.");
//            }
//            });
//           record.getChildren().add(saveButton);});
//            
//            // mange update the record 
//            Button addUpdatedRecord = new Button("update Record");
//             addUpdatedRecord.setOnAction(n -> {
//              Label updatedrecordID = new Label(" updated recordID:");
//              TextField updatedrecordIDfiled = new TextField(); 
//              int data1=Integer.parseInt(updatedrecordIDfiled.getText());
//              if (! ListOfHealthRecord.containsKey(data1) ){
//             System.out.println("the id is not found in the data base wrong record id ");
//             Alert alert = new Alert(Alert.AlertType.ERROR);
//                        alert.setTitle("Error");
//                        alert.setHeaderText("Record Not Found");
//                        alert.setContentText("The ID is not found in the database. Please enter a valid record ID.");
//                        alert.showAndWait();
//             }else{
//              Label updatedpetID = new Label("updated petID:");
//              TextField updatedpetIDData = new TextField(); 
//              Label updateddescription = new Label("updated description:");
//              TextField updateddescriptionData = new TextField(); 
//             VBox record = new VBox(20,updatedrecordID,updatedrecordIDfiled,updatedpetID,updatedpetIDData,updateddescription,updateddescriptionData);
//              Stage updateStage = new Stage();
//        updateStage.setTitle("  updated Health Record");
//        updateStage.setScene(new Scene(record, 300, 200));
//        updateStage.show();
//        Button saveButton = new Button("Save Record");
//              saveButton.setOnAction(p -> {                  
//                try {
//                int UpdatedRecordID = Integer.parseInt(updatedrecordIDfiled.getText());
//                int UpdatedpetID = Integer.parseInt(updatedpetIDData.getText());
//                String Updateddescription = updateddescriptionData.getText();
//                HealthRecord newHealthRecord2 = new HealthRecord(UpdatedRecordID, UpdatedpetID, Updateddescription);
//                ListOfHealthRecord.put(UpdatedRecordID, newHealthRecord2);
//                updatedrecordIDfiled.clear();
//                updatedpetIDData.clear();
//                updateddescriptionData.clear();
//
//                System.out.println("Health record UPdated: " + newHealthRecord2);
//                updateStage.close();
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter valid numbers for record ID and pet ID.");
//            }
//                record.getChildren().add(saveButton);});
//              } });
//           
//             // mesh 3arfa display data in map
////            Button display = new Button(" display");
////           display.setOnAction(q->{ 
////             Label recordID = new Label("recordID to display data of pet :");
////              TextField updatedrecordIDfiled = new TextField(); 
////              int data2=Integer.parseInt(updatedrecordIDfiled.getText());
////              if (ListOfHealthRecord.containsKey(data2) )
////              {
////              HealthRecord1  datafound =ListOfHealthRecord.get(recordID);
////              
////              
////              
////              
////                });
//           });
//    // ProvidePrescriptions 
//     Button Prescriptions= new Button("Prescriptions");
////       prcripation1.addPrescription();
//        Button addp= new Button("  add Prescriptions");
//addp.setOnAction(p->
//{
//     Label presciptionid = new Label("presciption ID");
//      TextField presciptioniddata = new TextField(); 
//              Label petID3 = new Label("petID:");
//              TextField petIDData3 = new TextField(); 
//              Label instruction = new Label("instruction:");
//              TextField instructiondata = new TextField(); 
//            VBox instructionv = new VBox(20,presciptionid,presciptioniddata,petID3,petIDData3,instruction,instructiondata);
//                Stage Prescriptionssecne = new Stage();
//        Prescriptionssecne.setTitle("Add Prescriptions");
//        Prescriptionssecne.setScene(new Scene(instructionv, 300, 200));
//        Prescriptionssecne.show();
//        Button saveButton = new Button("Save Record");
//          saveButton.setOnAction(event -> {                  
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
//                Prescriptionssecne.close();
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter valid numbers for presciption ID and pet ID and instruction  .");
//            }
//          });
//});
////       prcripation1.updatePrescripation();
//   Button updatep= new Button("  update Prescriptions");
//   updatep.setOnAction( update->{
//    Label updatedpresciptionId = new Label(" updated recordID:");
//    TextField updatedpresciptionIdfileld = new TextField(); 
//    int data1=Integer.parseInt(updatedpresciptionIdfileld.getText());
//              if (! ListOfPrescricption.containsKey(data1) ){
//             System.out.println("the id is not found in the data base wrong record id ");
//             Alert alert = new Alert(Alert.AlertType.ERROR);
//                        alert.setTitle("Error");
//                        alert.setHeaderText("Record Not Found");
//                        alert.setContentText("The ID is not found in the database. Please enter a valid record ID.");
//                        alert.showAndWait();
//             }else{
//              Label updatedpetID = new Label("updated petID:");
//              TextField updatedpetIDData2 = new TextField(); 
//              Label updatedinstruation = new Label("updated description:");
//              TextField updatedinstrucationData = new TextField(); 
//             VBox record = new VBox(20,updatedpresciptionId,updatedpresciptionIdfileld,updatedpetID,updatedpetIDData2,updatedinstruation,updatedinstrucationData);
//        Stage updatepsatge = new Stage();
//        updatepsatge.setTitle("  updated  prescraption");
//        updatepsatge.setScene(new Scene(record, 300, 200));
//        updatepsatge.show();
//        Button saveButton = new Button("Save Record");
//              saveButton.setOnAction(n -> {                  
//                try {
//                int UpdatedPrecraptionID = Integer.parseInt(updatedpresciptionIdfileld.getText());
//                int UpdatedpetID = Integer.parseInt(updatedpetIDData2.getText());
//                String Updatedinstrucation = updatedinstrucationData.getText();
//               
//                 Prescription Prescription3= new Prescription(UpdatedPrecraptionID, UpdatedpetID, Updatedinstrucation);
//                ListOfPrescricption.put(UpdatedPrecraptionID, Prescription3);
//                updatedpresciptionIdfileld.clear();
//                updatedpetIDData2.clear();
//                updatedinstrucationData.clear();
//
//                System.out.println("Health record UPdated: " + Prescription3);
//                updatepsatge.close();
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter valid numbers for record ID and pet ID.");
//            }
//                record.getChildren().add(saveButton);});
//              }
//   
//   
//   });
//    Button view= new Button("view");
//    view.setOnAction(z->{
//    Label presciptionid = new Label("presciption Id :");
//    TextField presciptioniddata = new TextField(); 
//    int presciptionidget = Integer.parseInt(presciptioniddata.getText());
//     if (Listtreatmenthistory.containsValue("presciptionidget")){
//     System.out.println( Listtreatmenthistory.get(presciptionidget));
//     }     
//    });
//    HBox hbox1 = new HBox(20,manage,Prescriptions,view);
//    hbox1.setAlignment(Pos.CENTER);       
//    Scene veterinarian = new Scene(hbox1);


            
//this is the first panel will appear.
//        Label label1 = new Label("ID");
//        TextField textfeild = new TextField();
//        HBox hbox = new HBox(10,label1,textfeild);
//        Button signIn = new Button("SIGN IN");
//        VBox vbox = new VBox(10, hbox, signIn);  

//after entring the number 1 it takes you to the admin page 
//           Label label2= new Label("petowner");         
//           Button add = new Button("Add");
//           Label label4 = new Label("ID:");
//           TextField textField2 = new TextField();
//           
//           Label label3 = new Label("Name:");
//           TextField textField1 = new TextField(); 
//           add.setOnAction(a -> {
//            try {
//                int ID = Integer.parseInt(textField2.getText());
//                String name = textField1.getText();
//
//                if (petowner.containsKey(ID)) {
//                    throw new IllegalArgumentException("Pet owner with ID " + ID + " already exists.");
//                }
//
//                // Write to file
//                try (BufferedWriter writer = new BufferedWriter(new FileWriter("petowners.txt", true))) {
//                    writer.write("ID: " + ID + ", Name: " + name);
//                    writer.newLine();
//                }
//
//                petowner.put(ID, name);
//                System.out.println("ID = " + ID + ", Name = " + name);
//
//                // Clear text fields after adding
//                textField2.clear();
//                textField1.clear();
//            } catch (NumberFormatException e) {
//                System.out.println("Error: ID must be a number.");
//            } catch (IllegalArgumentException o) {
//                System.out.println("Error: " + o.getMessage());
//           } catch (IOException ex) {
//                System.out.println("Error writing to file: " + ex.getMessage());
//            }
//        });
//               
//        Button edit = new Button ("edit");
//        edit.setOnAction(b -> {
//            
//           Label label6 = new Label(" new ID:");
//           TextField textField3 = new TextField();
//           
//           Label label7 = new Label(" new Name:");
//           TextField textField4 = new TextField();
//           
//           Label label8 = new Label(" current id");
//           TextField textField5 = new TextField();
//            
//        try{
//            int newID = Integer.parseInt(textField3.getText());
//            String newname = textField4.getText();
//            int oldID = Integer.parseInt(textField5.getText());   
//                        
//            if(petowner.isEmpty()){
//               throw new IllegalArgumentException("the map is empty");
//            }
//            else{
//                petowner.remove(oldID);
//                petowner.put(newID, newname);
//                System.out.println("Updated pet owner ID " + newID + " to new ID " + newname + " with name " + newname);
//                }
//            } 
//            catch(IllegalArgumentException l){
//                System.out.println("An error occurred: " + l.getMessage());    
//                }            		 
//            VBox vBox2 = new VBox(10, label6, textField3, label7, textField4,label8,textField5);
//            vBox2.setAlignment(Pos.CENTER);
//            textField3.clear();
//            textField4.clear();
//            textField5.clear();
//        });        
//        Button remove = new Button ("remove");
//         remove.setOnAction(c -> {
//           Label label9 = new Label("ID:");
//           TextField textField6 = new TextField();
//                   
//        try {
//            int ID1 = Integer.parseInt(textField6.getText());   
//            
//        if(petowner.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//        }
//        if(!petowner.containsKey(ID1)){
//             throw new IllegalArgumentException("Pet owner with ID " + ID1 + " does not exist.");
//            }            
//         petowner.remove(ID1);
//           System.out.println("ID = " + ID1 + "removed");
//           }            
//            catch (IllegalArgumentException u) {
//        System.out.println("Error: " + u.getMessage());
//        }                      
//            HBox hBox1 = new HBox(10, label9, textField6);
//            hBox1.setAlignment(Pos.CENTER);               
//            textField6.clear();  
//        });
//               
//      Button list = new Button ("list");
////        
////        list.setOnAction(d -> {
////        try{
////            if(petowner.isEmpty()){
////                throw new IllegalArgumentException("the map is empty");
////            }
////            else{
////                System.out.println("List of Pet Owners:");
////            for(Integer  petowenerid :petowner.keySet()){                 
////                String petowenername= petowner.get(petowenerid);
////                System.out.println(" pet owner name  " +petowenername+ " pet owner id "+petowenerid );
////            }                                      
////                }
////            } 
////        catch(IllegalArgumentException e){
////                System.out.println("An error occurred: " + e.getMessage());   
////            }            
////	}); 
//                
//        VBox vbox3 = new VBox(10,label2,add,edit,remove,list);        
//        
//        Label label5= new Label("veterinarian");
//        Button add1 = new Button ("add");
//                
//        add1.setOnAction(e -> {
//           Label label10 = new Label("ID:");
//           TextField textField7 = new TextField();
//           
//           Label label11 = new Label("Name:");
//           TextField textField8 = new TextField();            
//           try {
//            int vetID = Integer.parseInt(textField7.getText());   
//            String vetname = textField8.getText();
//        if (veterinarian.containsKey(vetID)) {
//            throw new IllegalArgumentException("Pet owner with ID " + vetID + " already exists.");
//        }
//           veterinarian.put(vetID, vetname);
//           System.out.println("ID = " + vetID + ", Name = " + vetname);
//           }            
//            catch (IllegalArgumentException o) {
//        System.out.println("Error: " + o.getMessage());
//        }                      
//            VBox vBox4 = new VBox(10, label10, textField7, label11, textField8);
//            vBox4.setAlignment(Pos.CENTER);               
//            textField7.clear();
//            textField8.clear();   
//        });
//                
//        Button edit1 = new Button ("edit");
//        
//        edit.setOnAction(f -> {
//            
//           Label label12 = new Label(" new ID:");
//           TextField textField9 = new TextField();
//           
//           Label label13 = new Label(" new Name:");
//           TextField textField10 = new TextField();
//           
//           Label label14 = new Label(" current id");
//           TextField textField11 = new TextField();
//            
//        try{
//            int newvetID = Integer.parseInt(textField9.getText());
//            String newvetname = textField10.getText();
//            int oldvetID = Integer.parseInt(textField11.getText());   
//                        
//        if (veterinarian.isEmpty()){
//            throw new IllegalArgumentException("The map is empty");
//        }
//        if (!veterinarian.containsKey(newvetID)) {
//            throw new IllegalArgumentException("Veterinarian with ID " + oldvetID + " does not exist.");
//        }
//        if (veterinarian.containsKey(newvetID) && newvetID != oldvetID) {
//            throw new IllegalArgumentException("Veterinarian with new ID " + newvetID + " already exists.");
//        }
//        else{
//            veterinarian.remove(oldvetID);
//            veterinarian.put(newvetID, newvetname);
//  System.out.println("Updated veterinarian ID " + oldvetID + " to new ID " + newvetID + " with name " + newvetname);
//                }
//            } 
//            catch(IllegalArgumentException l){
//                System.out.println("An error occurred: " + l.getMessage());    
//                }            		 
//            VBox vBox2 = new VBox(10, label12, textField9, label13, textField10,label14,textField11);
//            vBox2.setAlignment(Pos.CENTER);
//            textField9.clear();
//            textField10.clear();
//            textField11.clear();
//        });        
//        
//        Button remove1 = new Button ("remove");
//        
//        remove1.setOnAction(g -> {
//           Label label15 = new Label("ID:");
//           TextField textField12 = new TextField();
//                   
//        try {
//            int ID2 = Integer.parseInt(textField12.getText());   
//            
//        if(veterinarian.isEmpty()){
//            throw new IllegalArgumentException("the map is empty");
//        }
//        if(!veterinarian.containsKey(ID2)){
//             throw new IllegalArgumentException("veterinarian with ID " + ID2 + " does not exist.");
//            }            
//         veterinarian.remove(ID2);
//           System.out.println("ID = " + ID2 + "removed");
//           }            
//            catch (IllegalArgumentException u) {
//        System.out.println("Error: " + u.getMessage());
//        }                      
//            HBox hBox1 = new HBox(10, label15, textField12);
//            hBox1.setAlignment(Pos.CENTER);               
//            textField12.clear();  
//        });
//        
//        Button list1 = new Button ("list");
//        list1.setOnAction(h -> {
////        try{
////            if(veterinarian.isEmpty()){
////                throw new IllegalArgumentException("the map is empty");
////            }
////            else{
////                System.out.println("List of veterinarian:");
////            for(Integer  petowenerid :veterinarian.keySet()){                 
////                String petowenername= veterinarian.get(petowenerid);
////                System.out.println(" veterinarian name  " +petowenername+ " veterinarian id "+petowenerid );
////            }                                      
////                }
////            } 
////        catch(IllegalArgumentException e){
////                System.out.println("An error occurred: " + e.getMessage());   
////            }           
//        });
//
//        VBox vbox4 = new VBox(20,label5,add1,edit1,remove1,list1);
//                
//        Button reminder = new Button("send reminder");
//        reminder.setOnAction(i -> {
//        
//        });
//        BorderPane borderPane = new BorderPane();
//        borderPane.setLeft(vbox3); 
//        borderPane.setRight(vbox4);
//        borderPane.setBottom(reminder);
//        
//        Scene admin = new Scene(borderPane); 
//        
//if the entered number is between 2 and 50 it will open veterinarian page.
//      Button manage= new Button("manage");
//      Button provide= new Button("provide");
//      Button view= new Button("view");
//      HBox hbox1 = new HBox(20,manage,provide,view);
//      hbox1.setAlignment(Pos.CENTER);       
//      Scene veterinarian = new Scene(hbox1);
//        
//if the entered number between 51 and 61 it will open petowner page.
//      Button track = new Button("track");
//      Button book =new Button("book");
//      HBox hbox2 = new HBox(20,track,book);
//      hbox2.setAlignment(Pos.CENTER);  
//      Scene petOwner = new Scene(hbox2);        
//               
//      Scene scene = new Scene(vbox);        
//      primaryStage.setTitle("Pet Care System");
//      primaryStage.setScene(scene);
//      primaryStage.show();
//                
//       signIn.setOnAction(e -> {
//       string idText = textfeild.getText();            
//       int id = Integer.parseInt(idText);
//       if (id == 1) {
//       primaryStage.setScene(admin);
//      }else if (id >= 2 && id <= 50) {
//       primaryStage.setScene(petOwner);
//      }else if (id >= 51 && id <= 70) {
//       primaryStage.setScene(veterinarian);
//      }             
//      });   
//      }