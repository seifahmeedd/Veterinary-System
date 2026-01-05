package pet.care.management.system;

import java.util.*;

public class PetCareManagementSystem {
    
    public static void main(String[] args) {
      while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 0. close program");        
        System.out.println(" 1. add petowner");
        System.out.println(" 2. edit petowner");
        System.out.println(" 3. remove petowner");
        System.out.println(" 4. list petowner");
        System.out.println(" 5. add Veterinarian");
        System.out.println(" 6. edit Veterinarian");
        System.out.println(" 7. remove Veterinarian");
        System.out.println(" 8. list Veterinarian");
        System.out.println(" 9. send reminder");
        System.out.println(" 10. veratrian  Mange HeathRecord ");
        System.out.println(" 11. veratrian provide prescription");
        System.out.println(" 12.view treatment history");

        System.out.println(" 13.Track Pet Health");
        System.out.println(" 14.Book appointment");

        System.out.println("Enter your choice");        
        Scanner input =new Scanner(System.in);
        int choice= input.nextInt();
       
       switch(choice){
           case 0:
               System.out.println( "Exiting Pet Care Mangment System.");
                System.exit(0);
            
           case 1: 
        Admin petowner = new Admin();                
        System.out.println("Enter Pet Owner ID:");
        int petOwnerID = scanner.nextInt(); 
        scanner.nextLine(); 
        System.out.println("Enter Pet Owner Name:");
        String petOwnerName = scanner.nextLine(); 
        petowner.addPetOwner(petOwnerID, petOwnerName);
        break; 
        
           case 2:
               Admin petowner2 = new Admin(); 
               System.out.println("Enter Pet Owner ID:");
        int petOwnerID3 = scanner.nextInt(); 
        System.out.println("new pet Owner ID:");
        int newpetOwnerID = scanner.nextInt(); 
        scanner.nextLine(); 
        System.out.println("Enter new Pet Owner Name:");
        String newpetOwnerName = scanner.nextLine(); 
        petowner2.editPetOwner(newpetOwnerID, newpetOwnerName, petOwnerID3);
                break;           
           
           case 3:
               Admin petowner1 = new Admin();
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("Enter Pet Owner ID:");
        int petOwnerID2 = scanner2.nextInt(); 
        scanner2.nextLine();
            petowner1.removePetOwner(petOwnerID2);
                break;
               
            case 4:
                Admin petowner3 = new Admin();
                petowner3.listPetOwner();
                break; 
                
           case 5:            
        Admin veterinarian = new Admin();
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Enter veterinarian ID:");
        int VeterinarianID = scanner1.nextInt(); 
        scanner1.nextLine(); 
        System.out.println("Enter veterinarian Name:");
        String VeterinarianName = scanner1.nextLine(); 

        veterinarian.addVeterinarian(VeterinarianID, VeterinarianName);            
                break;
                
            case 6:
                Admin vet = new Admin();
                Scanner scanner3 = new Scanner(System.in);
                
                System.out.println("Enter Veterinarian ID:");
                int ID = scanner3.nextInt(); 
                scanner3.nextLine();
                
                System.out.println("Enter new Veterinarian ID:");
                int ID1 = scanner3.nextInt(); 
                scanner3.nextLine();                
                System.out.println("Enter new Veterinarian name:");
                String name = scanner3.nextLine(); 
                vet.editVeterinarian(ID, ID1, name);
                break;
                 
            case 7:
                 Admin manager1 = new Admin();
             Scanner scanner4 = new Scanner(System.in);
        
            System.out.println("Enter Pet Owner ID:");
            int vetID = scanner4.nextInt(); 
            scanner4.nextLine();                        
            manager1.removeVeterinarian(vetID);
                break; 
                       
            case 8:
                  Admin manager = new Admin();
                manager.listVeterinarian();               
                break;
                             
            case 9:
                  Admin manager2 = new Admin();
                    manager2.sendReminder ();     
                break;
                
            case 10:
             System.out.println("enter ID of the vet ");
                int vetid=scanner.nextInt();
                 System.out.println("name  of the vet ");
                String vetname=scanner.nextLine();
                Veterinarian vet1=new Veterinarian(vetid,vetname);
                System.out.println("if you want to add health record enter true ");
                boolean addhealth=scanner.nextBoolean();
                boolean updatehealth=false ;
                boolean display=false;
                if (addhealth!=true & display !=true){
                      System.out.println("if you want to update health record enter true ");
                updatehealth =scanner.nextBoolean();
                  }
                 if (addhealth!=true & updatehealth !=true){
                      System.out.println("  enter true to  display health record");
                updatehealth =scanner.nextBoolean();
                
                }
                 else{
                     display=true;
                 }
                vet1.MangeHeathRecord(addhealth, updatehealth, display);
                                
            case 11:
                 System.out.println("enter ID of the vet ");
                int vetid2=scanner.nextInt();
                 System.out.println("name  of the vet ");
                String vetname2=scanner.nextLine();
                Veterinarian vet2=new Veterinarian(vetid2,vetname2);
                vet2.ProvidePrescriptions();
                
            case 12 :               
             System.out.println("enter ID of the vet ");
                int vetid3=scanner.nextInt();
                 System.out.println("name  of the vet ");
                String vetname3=scanner.nextLine();
                Veterinarian vet3=new Veterinarian(vetid3,vetname3);
                vet3.viewTreatmentHistory();
                
            case 13:
                System.out.println("To tarck pet health enter pet owner name ");
                String ownerName=scanner.nextLine();
                System.out.println("To tarck pet health enter pet id  ");
                int petid=scanner.nextInt();
                PetOwner PetOwner1=new PetOwner(petid,ownerName);
                PetOwner1.trackPetHealth(petid);
                              
            case 14:                
                 System.out.println("To book appoiment  ");
                String ownerName2=scanner.nextLine();
                
                System.out.println("To tarck pet health enter pet id  ");
                int petid2=scanner.nextInt();
                
                System.out.println("book appoinment:");
                PetOwner pet1=new PetOwner(petid2,ownerName2);
                
                pet1.bookAppointment();
            default:
       System.out.println("Invalid choice. Please choose a number between 0 and 14.");  
       }
       }
    }
}