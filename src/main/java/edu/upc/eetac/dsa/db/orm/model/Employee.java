package edu.upc.eetac.dsa.db.orm.model;

public class Employee {

    private String name;
    private String surname;

   private String address;

    private String birthDay;

    private int genere;

    private String email;

    public int getGenere() {
        return genere;
    }

    public void setGenere(int genere) {
        this.genere = genere;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private double salary;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String  name, String surname, double salary) {
        this(name, surname, "", salary);
    }

    public Employee(String  name, String surname, String email, double salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
