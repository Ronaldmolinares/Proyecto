package model;

public enum TreatmentEnum {
    GENERAL_CONSULT(50000),
    ORTODONTIC_CONTROL(70000),
    ORAL_SURGERY(120000),
    PERIDONTICS(450000);

    private double amount;

    private TreatmentEnum(double amount) {
        this.amount = amount;
    }

	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

}
