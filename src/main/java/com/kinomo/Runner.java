package main.java.com.kinomo;

import com.sun.java.accessibility.util.EventQueueMonitor;
import main.java.com.kinomo.audit.Tax;
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
        //steveManagement.hireNewEmployee(steve);
        System.out.println("All money: " + steveManagement.allMoney());

        Employee ray = new Employee("Ray", "Stuff", 450, "junior");
        Management rayManagement = new Management(ray);

        System.out.println(rayManagement.getFullName());
        steveManagement.newSalary();
        System.out.println("Ray's salary: " + ray.getSalary());
        System.out.println("Ray's salary after recount: " + rayManagement.newSalary());
        System.out.println("All money: " + rayManagement.allMoney());


        Tax tax1 = new Tax();
        Management calc = new Management(tax1, 40, true);
        System.out.println("Tax count: " + calc.calcTax());


        Management manMassive = new Management();
        Employee sam = new Employee(300, "junior");
        Employee bob = new Employee(458, "middle");
        Employee jack = new Employee(730, "senior");

        manMassive.addMassEmp(steve, 0);
        manMassive.addMassEmp(ray, 1);
        manMassive.addMassEmp(sam, 2);
        manMassive.addMassEmp(bob, 3);
        manMassive.addMassEmp(jack, 4);

        System.out.println(manMassive.getEmpl(1));

        manMassive.setNewSalary("middle", 500);
        manMassive.printPosition("junior");
        manMassive.minMax(500, 900);







    }


}
