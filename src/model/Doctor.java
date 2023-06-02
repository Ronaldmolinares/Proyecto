package model;

public class Doctor extends Person {
    private SpecialityEnum specialty;
    private String speciality;

    public Doctor() {

    }

    public Doctor(int id, String name, String lastName, String phone, String address, String email,
            SpecialityEnum specialty) {
        super(id, name, lastName, phone, address, email);
        this.specialty = specialty;
    }

    public Doctor(int id, String name, String lastName, String phone, String address, String email,
			String speciality) {
    	this.speciality = speciality;
	}

	public SpecialityEnum getSpecialty() {
        return specialty;
    }

    public void setSpecialty(SpecialityEnum specialty) {
        this.specialty = specialty;
    }

    public String careForPatient() {
        return " ";
    }

    @Override
    public String toString() {
        return super.toString() + "; " + specialty;
    }

}
