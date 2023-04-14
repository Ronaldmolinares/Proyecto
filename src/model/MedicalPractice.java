package model;

import java.util.Iterator;
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

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public Patient patient(int position) {
        return patients.get(position);
    }

    public Doctor doctor(int position) {
        return doctors.get(position);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public int findDoctor(int id) {
        int position = -1;
        for (Doctor doc : doctors) {
            if (id == doc.getId()) {
                position = doctors.indexOf(doc);
            }
        }
        return position;
    }

    public int findPatient(int id) {
        int position = -1;
        for (Patient pat : patients) {
            if (id == pat.getId()) {
                position = patients.indexOf(pat);
            }
        }
        return position;
    }

    public String showBills() {
        String salida = "\t\t---------------------------------------- \t\t LIST OF BILLS \t\t--------------------------------------------------\t\t"
                +
                "\n";
        Iterator it = bills.iterator();
        while (it.hasNext()) {
            salida += (it.next()) + "\n";
        }
        return salida;
    }

    @Override
    public String toString() {
        return "MedicalPractice [id=" + id + ", name=" + name + ", city=" + city + ", adress=" + adress + "]";
    }
}
