package main.java.com.kinomo;

import main.java.com.kinomo.audit.Management;
import main.java.com.kinomo.models.Employee;
import main.java.com.kinomo.audit.Tax;

public class Runner {
    public static void main(String args[]) {
        Employee steve = new Employee("Steve", "Jobs", 500, "middle");
        Management steveManagement = new Management(steve);

        System.out.println("All money: " + steveManagement.allMoney());
        System.out.println(steveManagement.getFullName());
        steveManagement.newSalary();
        System.out.println("Steve's salary: " + steve.getSalary());
        System.out.println("Steve's salary after recount: " + steveManagement.newSalary());
        System.out.println("All money: " + steveManagement.allMoney());

        Employee ray = new Employee("Ray", "Stuff", 450, "junior");
        Management rayManagement = new Management(ray);

        System.out.println(rayManagement.getFullName());
        steveManagement.newSalary();
        System.out.println("Steve's salary: " + ray.getSalary());
        System.out.println("Steve's salary after recount: " + rayManagement.newSalary());
        System.out.println("All money: " + rayManagement.allMoney());

    }
}
