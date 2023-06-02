package model;

import java.util.Date;

public class Patient extends Person {
    private String birthday;

    public Patient() {

    }

    public Patient(int id, String name, String lastName, String phone, String address, String email,
            String birthday) {
        super(id, name, lastName, phone, address, email);
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String payBills() {
        return "";
    }

    
    @Override
    public String toString() {
        return super.toString() + ";" + birthday;
    }

}
