package model;

import java.util.Date;

public class Patient extends Person {
    private Date birthday;

    public Patient() {

    }

    public Patient(int id, String name, String lastName, String phone, String address, String email,
            Date birthday) {
        super(id, name, lastName, phone, address, email);
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String payBills() {
        return "";
    }

    @Override
    public String toString() {
        return "Patient " + super.toString() + ", birthday=" + birthday + "]";
    }

}
