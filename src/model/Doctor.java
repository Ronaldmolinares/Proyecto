package model;

public class Doctor extends Person{
    private String specialty;
    
    public Doctor (){

    }

    public Doctor(int id, String name, String lastName, String phone, String address, String email, String specialty) {
        super(id, name, lastName, phone, address, email);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String careForPatient(){
        return " ";
    }

    @Override
    public String toString() {
        return "Doctor [specialty=" + specialty + "]";
    }

    
}
