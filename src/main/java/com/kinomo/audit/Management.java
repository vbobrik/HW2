package main.java.com.kinomo.audit;

import main.java.com.kinomo.models.Employee;

public class Management {
    private int money = 130040;
    private int leftMoney = 140;
    private boolean usd;
    private Employee employee;
    private Tax tax;

    public Management() {
    }

    public Management(Tax tax, int leftMoney, boolean usd) {
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

        if (this.employee.getJobPosition() == "junior") {
            this.employee.setSalary(this.employee.getSalary() + 200);
        } else if (this.employee.getJobPosition() == "middle") {
            this.employee.setSalary(this.employee.getSalary() + 300);
        } else if (this.employee.getJobPosition() == "senior") {
            this.employee.setSalary(this.employee.getSalary() + 500);
        }

        this.money = this.money - this.employee.getSalary();
        return this.employee.getSalary();

    }


    public void hireNewEmployee(Employee employee) {
        int x;
        for (x = 1; x < 5; x ++) {
            this.money = this.money - employee.getSalary();
        }
    }

    public int calcTax() {
        for (this.money = 130000; this.money < 140000; this.money++) {
            this.money = this.money * (int) tax.getTaxPercent();
        }
        return this.money;
    }


    private Employee[] massEmp = new Employee[5];

    public Employee[] getMassEmp() {
        return this.massEmp;
    }

    public void setMassEmp(Employee[] newMassEmp) {
        this.massEmp = newMassEmp;
    }

    public void addMassEmp(Employee employee, int i) {
        this.massEmp[i] = employee;
    }

    public Employee getEmpl(int i) {
        return this.massEmp[i];
    }


    public void setNewSalary(String jobposition, int salary) {
        int i;
        for (i = 0; i < this.massEmp.length; i++) {

            if (this.massEmp[i].getJobPosition() == jobposition) {
                this.massEmp[i].setSalary(salary);
                System.out.println(this.massEmp[i].getSalary());
            }

        }
    }

    public void printPosition(String position) {
        int i;
        for (i = 0; i < this.massEmp.length; i++) {

            if (this.massEmp[i].getJobPosition() == position) {
                System.out.println(this.massEmp[i].getJobPosition());
            }
        }
    }

    public void minMax(int minSalary, int maxSalary) {
        if (minSalary >= 0 & maxSalary >= 0 & minSalary < maxSalary) {
            int i;
            for (i = 0; i < this.massEmp.length; i++) {
                if (this.massEmp[i].getSalary() > minSalary & this.massEmp[i].getSalary() < maxSalary) {
                    System.out.println(this.massEmp[i].getSalary());
                }
            }
        }
    }


}
