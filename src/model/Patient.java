package model;

public class Patient extends Person{
    private String gender;
    private Date birthday;

    public Patient(){

    }

    public Patient(int id, String name, String lastName, String phone, String address, String email, String gender,
            Date birthday) {
        super(id, name, lastName, phone, address, email);
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String payBills(){
        return "";
    }

    @Override
    public String toString() {
        return "Patient [gender=" + gender + ", birthday=" + birthday + "]";
    }

    
}
