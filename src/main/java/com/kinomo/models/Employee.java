package main.java.com.kinomo.models;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private String jobPosition;

    public Employee(String firstName, String lastName, int salary, String jobPosition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.jobPosition = jobPosition;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastname) {
        this.lastName = newLastname;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public String getJobPosition() {
        return this.jobPosition;
    }

    public void setJobPosition(String newJobPosition) {
        this.jobPosition = newJobPosition;
    }
}