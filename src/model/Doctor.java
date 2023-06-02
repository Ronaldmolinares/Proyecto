package model;

public class Doctor extends Person {
    private SpecialityEnum speciality;

    public Doctor() {

    }

    public Doctor(int id, String name, String lastName, String phone, String address, String email,
            SpecialityEnum specialty) {
        super(id, name, lastName, phone, address, email);
        this.speciality = specialty;
    }

    public SpecialityEnum getSpecialty() {
        return speciality;
    }

    public void setSpecialty(SpecialityEnum speciality) {
        this.speciality = speciality;
    }

    public String careForPatient() {
        return " ";
    }

    @Override
    public String toString() {
        return super.toString() + "; " + speciality;
    }

}
