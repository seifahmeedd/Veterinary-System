
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.control.Label;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saif Ahmed
 */
class appointments {
        
    public int appointmentID;
    public Pet pet;
    public Veterinarian vet;
    public String date;
    public int time;
    public ArrayList<String> appointments;
  
      public  appointments(int appointmentID, Pet pet, Veterinarian vet, String date, int time){
          this.appointmentID=appointmentID;
          this.pet=pet;
          this.vet=vet;
          this.date=date;
          this.time=time;
      }

    appointments() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    appointments(int appointmentId, int petID, String petOwnerName, Label vetID, Label vetName, String date, String time) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
      public String getAppointmentDeatils (){
     return "Appointment ID: "+appointmentID+"Pet Details: "+pet+"vet Details: "+vet+"Date of the appointment"+date+"Time "+ time;
      }
      
      public String getDateTime(){
           return " Date of the appointment" + date + " and the Time " + time;
      }

    public void bookAppointment(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter appointment ID :");
        int newappointmentID = scanner.nextInt();
        System.out.println("Enter Pet ID:");
        int petID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Pet Name:");
        String petName = scanner.nextLine();
        Pet newpet = new Pet(petID, petName);
           System.out.println("Enter Veterinarian ID:");
        int  vetID = scanner.nextInt();
         System.out.println("Enter Veterinarian Name:");
        String vetName = scanner.nextLine();
        Veterinarian newvet = new Veterinarian(vetID,vetName);
           System.out.println("Enter date:");
          String newdate=scanner.nextLine();
          System.out.println("Enter time:");
          int newtime =scanner.nextInt();
           appointments appointment = new appointments(newappointmentID, newpet, newvet, newdate,newtime);
          //appointments.add(appointment);         
      }

    String getAppointmentId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getPetId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getVetId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getVetName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getPetName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTime() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}