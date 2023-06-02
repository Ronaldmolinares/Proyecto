package model;

import java.util.Iterator;
import java.util.ArrayList;

public class MedicalPractice {
    private ArrayList<Patient> patients = new ArrayList<Patient>();
    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private ArrayList<Bill> bills = new ArrayList<Bill>();

    public MedicalPractice() {

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
        String salida = "";
        Iterator it = bills.iterator();
        while (it.hasNext()) {
            salida += (it.next()) + "\n";
        }
        return salida;
    }

}
