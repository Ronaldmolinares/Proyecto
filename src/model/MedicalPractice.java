package model;
import java.util.ArrayList;

public class MedicalPractice {
    
    private int id;
    private String name;
    private String city;
    private String adress;
    private ArrayList<Patient> patients = new ArrayList<Patient>();
    private ArrayList<Doctor>doctors= new ArrayList<Doctor>();
    private ArrayList<Bill> bills= new ArrayList<Bill>();
    
    public MedicalPractice(){
        
    }
    
    public MedicalPractice(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    
}
