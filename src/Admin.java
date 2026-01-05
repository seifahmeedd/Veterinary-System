package pet.care.management.system;

import java.util.*;
import java.io.*;

public class Admin {
             
	private int AdminID;
	public String AdminName;
        public Map<Integer,String> petowner= new HashMap<>();
        public Map<Integer,String> veterinarian= new HashMap<>();
                           
 public Admin(){
        }
        
    public Admin(int AdminID,String AdminName,Map<Integer,String> petowner,Map<Integer,String> veterinarian ){
        this.AdminID =AdminID;
        this.AdminName =AdminName;
        this.petowner=petowner;
        this.veterinarian=veterinarian;
        }
          
    public void setAdminID(int newAdminID){
            AdminID=newAdminID;
        }
        
    public int getAdminID(){
           return AdminID;
        }
                    
    public void addPetOwner(int petOwnerID, String petOwnerName){        
    try {
        if (petowner.containsKey(petOwnerID)) {
            throw new IllegalArgumentException("Pet owner with ID " + petOwnerID + " already exists.");
        }
        petowner.put(petOwnerID, petOwnerName);
        System.out.println("Added Pet Owner: ID = " + petOwnerID + ", Name = " + petOwnerName);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
        }        
    }
	                                        
    public void editPetOwner( int newPetOwnerID, String newName, int petOwnerID) {
        try{
            if(petowner.isEmpty()){
               throw new IllegalArgumentException("the map is empty");
            }
            else{
                petowner.remove(petOwnerID);
                petowner.put(newPetOwnerID, newName);
                System.out.println("Updated pet owner ID " + petOwnerID + " to new ID " + newPetOwnerID + " with name " + newName);
                }
            } 
        catch(IllegalArgumentException e){
                 System.out.println("An error occurred: " + e.getMessage());    
                }            		            
	}
                                                                
    public void removePetOwner(int petOwnerID){
        try{
           if(petowner.isEmpty()){
             throw new IllegalArgumentException("the map is empty");
            }            
           if(!petowner.containsKey(petOwnerID)){
             throw new IllegalArgumentException("Pet owner with ID " + petOwnerID + " does not exist.");
            }            
              petowner.remove(petOwnerID);
              System.out.println("Removed the the petowner with id: " + petOwnerID);           
            }
         
        catch(IllegalArgumentException e){
        System.out.println("Error: " + e.getMessage());
            } 
        catch(Exception e){        
        System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }        
                            
    public void listPetOwner(){
        try{
            if(petowner.isEmpty()){
                throw new IllegalArgumentException("the map is empty");
            }
            else{
                System.out.println("List of Pet Owners:");
            for(Integer  petowenerid :petowner.keySet()){                 
                String petowenername= petowner.get(petowenerid);
                System.out.println(" pet owner name  " +petowenername+ " pet owner id "+petowenerid );
            }                                      
                }
            } 
        catch(IllegalArgumentException e){
                System.out.println("An error occurred: " + e.getMessage());   
            }            
	}                                        
        
    public void addVeterinarian(int VeterinarianID, String VeterinarianName) {
        try{
            if(veterinarian.containsKey(VeterinarianID)){
               throw new IllegalArgumentException("veterinarian with ID " + VeterinarianID + " already exists.");
                }                
                veterinarian.put(VeterinarianID, VeterinarianName);
                }
	catch(IllegalArgumentException e){
               System.out.println("Error: " + e.getMessage());
            }  
        catch(Exception e){        
               System.out.println("An unexpected error occurred: " + e.getMessage());
            }               
        }                                        
        
    public void editVeterinarian(int veterinarianID, int newVeterinarianID, String newVeterinarianName) {
    try {
        if (veterinarian.isEmpty()){
            throw new IllegalArgumentException("The map is empty");
        }
        if (!veterinarian.containsKey(veterinarianID)) {
            throw new IllegalArgumentException("Veterinarian with ID " + veterinarianID + " does not exist.");
        }
        if (veterinarian.containsKey(newVeterinarianID) && newVeterinarianID != veterinarianID) {
            throw new IllegalArgumentException("Veterinarian with new ID " + newVeterinarianID + " already exists.");
        }
        veterinarian.remove(veterinarianID);
        veterinarian.put(newVeterinarianID, newVeterinarianName);
        System.out.println("Updated Veterinarian ID " + veterinarianID + " to new ID " + newVeterinarianID + " with name " + newVeterinarianName);
    } catch (IllegalArgumentException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}      
                             
    public void removeVeterinarian(int VeterinarianID){            
	try{
            if(veterinarian.isEmpty()){
              throw new IllegalArgumentException("the map is empty");
            }           
            if(!veterinarian.containsKey(VeterinarianID)){
              throw new IllegalArgumentException("veterinarian with ID " + VeterinarianID + " does not exist.");
            }            
              veterinarian.remove(VeterinarianID);
              System.out.println("Removed the the veterinarian with id: "+VeterinarianID);           
            }         
        catch (IllegalArgumentException e) {
              System.out.println("Error: " + e.getMessage());
            }   
        catch (Exception e) {        
              System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }        
        
    public void listVeterinarian(){            
	try{
            if(veterinarian.isEmpty()){
                throw new IllegalArgumentException("the map is empty");
            }
            else{
                System.out.println("List of veterinarian:");
            for(Integer veterinarianid :veterinarian.keySet()){                 
                String veterinarianname= veterinarian.get(veterinarianid);
                System.out.println("veterinarian name  " +veterinarianname+ "veterinarian id "+veterinarianid );
                }                        
                }            
            }
        catch(IllegalArgumentException e){
                System.out.println("An error occurred: " + e.getMessage());   
            }           
	}    
        
    public String sendReminder(){
           Appointment appointment1 = new Appointment();
           return appointment1.getDateTime();
        }   
}