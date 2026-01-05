
class PetOwner {

     public int petOwnerId;
    public String petOwnerName;    
    
     public PetOwner(int petOwnerId, String petOwnerName){
        this.petOwnerId = petOwnerId;
        this.petOwnerName = petOwnerName;
    }
   
      public String trackPetHealth(int petId) {
          HealthRecord HealthRecord1 = new HealthRecord();
          return HealthRecord1.getRecordDetails();          
      }
            
      public void bookAppointment(){
        appointments appointment1 = new appointments();
          appointment1.bookAppointment();
      }

    public void setPetOwnerName(String petOwnerName) {
        this.petOwnerName = petOwnerName;
    }

    public void setPetOwnerId(int petOwnerId) {
        this.petOwnerId = petOwnerId;
    }

    String getPetOwnerName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}