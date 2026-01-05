import java.io.*;
import java .util.*;

class HealthRecord {
     private int recordID;
     private int PetID;
     private String description;
     public ArrayList<HealthRecord> ListOfHealthRecord= new ArrayList<>();
     
      public HealthRecord(int recordID, int petID, String description){
        this.recordID = recordID;
        this.PetID = petID;
        this.description = description;        
    }

    public int getRecordID() {
        return recordID;
    }

    public int getPetID() {
        return PetID;
    }

    public String getDescription() {
        return description;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public void setPetID(int PetID) {
        this.PetID = PetID;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
      
    public HealthRecord() {
        
    }
      public String getRecordDetails(){ 
          return  "Record ID:"+recordID+"  pet ID:"+PetID+"  Descripation:"+description;
      }
      public void addHealthRecord( String filePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
         Scanner scanner = new Scanner(System.in);
        try{
    System.out.println("Add Health Record  for the pet");
    System.out.println("Enter Record Id:");
    int newRecordId = scanner.nextInt();
    writer.write(String.valueOf(newRecordId));
     writer.newLine();
    System.out.println("Enter Pet Id:");
    int newpetID = scanner.nextInt();
    scanner.nextLine();
     scanner.nextLine();
    writer.write(String.valueOf(newpetID));
     writer.newLine();
    System.out.println("Enter description:");
    String newdescription = scanner.nextLine();
      writer.write(newdescription);
     writer.newLine();
     System.out.println("File created successfully: " + filePath);
     HealthRecord HealthRecord1 = new HealthRecord(newRecordId, newpetID, newdescription);
    ListOfHealthRecord.add(HealthRecord1);
    System.out.println("Prescription added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid input. " + e.getMessage());
            scanner.nextLine(); // Clear the invalid input
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        catch (IOException e) {
            System.out.println(" write or read error"+e.getMessage());
        }
    }
      public void updateHealthRecord(){
     Scanner scanner = new Scanner(System.in);
 System.out.println("Enter new recordID");
  int newrecordID=scanner.nextInt();
   System.out.println("Enter new pet ID ");
    int newpetid=scanner.nextInt();
    System.out.println("Enter new description  ");
    String newdescription=scanner.nextLine();
  for(HealthRecord HealthRecord1 : ListOfHealthRecord) {
  if ( HealthRecord1.getRecordID()!= newrecordID)
  {
      HealthRecord1.setRecordID( newrecordID);
  }
  else {
      System.out.println(" the new id is the same as the old id ");
  }
  if ( HealthRecord1.getPetID()!=newpetid)
  {
      HealthRecord1.setPetID(newpetid);
  }
  else {
      System.out.println(" the new pet  id is the same as the old id ");
  }
  if (!HealthRecord1.getDescription().equals(newdescription))
  {
      HealthRecord1.setDescription(newdescription);
  }
  else {
      System.out.println(" The Description are the same  ");
  }
  
  }
  
}
       public void displayHealthRecords() {
        System.out.println("List of Health Records:");
        for (HealthRecord record : ListOfHealthRecord) {
            System.out.println(record.getRecordDetails());
        }
    }
    
}