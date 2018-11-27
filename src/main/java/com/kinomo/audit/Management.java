package main.java.com.kinomo.audit;

import main.java.com.kinomo.models.Employee;

public class Management {
    private int money = 130040;
    private int leftMoney = 140;
    private boolean usd;
    private Employee employee;
    private Tax tax;
    Employee[] massEmp = new Employee[4];




    public Management( Tax tax, int leftMoney, boolean usd) {
        this.leftMoney = leftMoney;
        this.usd = usd;
        this.tax = tax;
    }

    public Management(Employee employee) {
        this.employee = employee;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int newSetMoney) {
        this.money = newSetMoney;
    }

    public int getLeftMoney() {
        return this.leftMoney;
    }

    public void setLastName(int newLeftMoney) {
        this.leftMoney = newLeftMoney;
    }

    public boolean getUsd() {
        return this.usd;
    }

    public void setSalary(boolean newCurrency) {
        this.usd = newCurrency;
    }

    //Get full name of employee

    public String getFullName() {
        return this.employee.getFirstName() + " " + this.employee.getLastName();
    }

    public int allMoney() {
        return this.money + this.leftMoney;
    }

    public int newSalary() {

        if (this.employee.getJobPosition() == "middle") {
            this.employee.setSalary(this.employee.getSalary() + 200);
        } else if (this.employee.getJobPosition() == "senior") {
            this.employee.setSalary(this.employee.getSalary() + 500);
        }

        this.money = this.money - this.employee.getSalary();
        return this.employee.getSalary();

    }

    public int newSalary(Employee i) {
        String man = i.getJobPosition();
        if (man == "middle") {
           i.setSalary(i.getSalary() + 200);
        } else if (man == "senior") {
            i.setSalary(i.getSalary() + 500);
        }

        this.money = this.money - i.getSalary();
        return i.getSalary();

    }
    public void hireNewEmployee(Employee employee) {
        int x;
        for (x = 1; x < 5; x ++) {
            this.money = this.money - employee.getSalary();
        }
    }

    public int calcTax() {
        for(this.money = 130000; this.money < 140000; this.money ++) {
            this.money = this.money * (int) tax.getTaxPercent();
        }
        return this.money;
    }

    public void addEmployee(Employee newEmployee, int index) {
        this.massEmp[index] = newEmployee;
    }

    public Employee getEmployee(int index) {
        return this.massEmp[index];
    }

    public int calcAllsalary() {

        for(int i = 0; i < this.massEmp.length; i ++) {

            this.newSalary(this.massEmp[i]);

        }
        return
    }

}
