package model;

public class Person {
    private int id;
    private String name;
    private String lastName;
    private String phone;
    private String address;
    private String email;

    public Person (){
        
    }

    public Person(int id, String name, String lastName, String phone, String address, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.email = email;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + ", phone=" + phone + ", address="
                + address + ", email=" + email + "]";
    }

    
}
