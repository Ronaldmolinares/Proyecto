package model;

public class Bill {

    private int numberBill;
    private Patient patient;
    private double amount;
    private String treatment;
    private Date consultationDate;

    public Bill(int numberBill, Patient patient, double amount, String treatment, Date consultationDate) {
        this.numberBill = numberBill;
        this.patient = patient;
        this.amount = amount;
        this.treatment = treatment;
        this.consultationDate = consultationDate;
    }

    public Bill(){

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

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    @Override
    public String toString() {
        return "Bill [numberBill=" + numberBill + ", patient=" + patient + ", amount=" + amount + ", treatment="
                + treatment + ", consultationDate=" + consultationDate + "]";
    }
    
    public void exportBill(){
        
    }
}
