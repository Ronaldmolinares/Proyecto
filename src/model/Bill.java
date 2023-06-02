package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill {

    private int numberBill;
    private Patient patient;
    private double amount;
    private TreatmentEnum treatmentEnum;
    private String consultationDate;

    public Bill(int numberBill, Patient patient, double amount, TreatmentEnum treatment, String consultationDate) {
        this.numberBill = numberBill;
        this.patient = patient;
        this.amount = amount;
        this.treatmentEnum = treatment;
        this.consultationDate = consultationDate;
    }

    public Bill() {

    }

    public int getNumberBill() {
        return numberBill;
    }

    public void setNumberBill(int numberBill) {
        this.numberBill = numberBill;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TreatmentEnum getTreatment() {
        return treatmentEnum;
    }

    public void setTreatment(TreatmentEnum treatment) {
        this.treatmentEnum = treatment;
    }

    public String getConsultationDate() {
        if (consultationDate == null) {
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            consultationDate = fechaHoraActual.format(formateador);
        }
        return consultationDate;
    }

    public void setConsultationDate(String consultationDate) {
        this.consultationDate = consultationDate;
    }

    @Override
    public String toString() {
        return numberBill + ";" + patient.getId() + ";" + patient.getName() + " " + patient.getLastName() + ";"
                + patient.getPhone() + ";" +
                treatmentEnum + ";" + amount + ";" +consultationDate ;
    }

}
