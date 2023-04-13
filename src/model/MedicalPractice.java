package model;

import java.util.ArrayList;

public class MedicalPractice {
    private int id;
    private String name;
    private String city;
    private String adress;
    private ArrayList<Patient> patients = new ArrayList<Patient>();
    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private ArrayList<Bill> bills = new ArrayList<Bill>();

    public MedicalPractice() {

    }

    public MedicalPractice(int id, String name, String city, String adress) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void addPacient(Patient patient) {
        patients.add(patient);
    }

    public int findPatient(int id) {
        int position = -1;
        for (Patient patient : patients) {
            if (id == patient.getId()) {
                position = patients.indexOf(patient);
            }
        }
        return position;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public int findDoctor(int id) {
        int position = -1;
        for (Doctor doctor : doctors) {
            if (id == doctor.getId()) {
                position = doctors.indexOf(doctor);
            }
        }
        return position;
    }

    public void addBills(Bill bill) {
        bills.add(bill);
    }

    @Override
    public String toString() {
        return "MedicalPractice [id=" + id + ", name=" + name + ", city=" + city + ", adress=" + adress + ", patients="
                + patients + ", doctors=" + doctors + ", bills=" + bills + "]";
    }
}
