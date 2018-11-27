package main.java.com.kinomo;
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
        steveManagement.hireNewEmployee(steve);
        System.out.println("All money: " + steveManagement.allMoney());

        Employee ray = new Employee("Ray", "Stuff", 450, "junior");
        Management rayManagement = new Management(ray);

        System.out.println(rayManagement.getFullName());
        steveManagement.newSalary();
        System.out.println("Steve's salary: " + ray.getSalary());
        System.out.println("Steve's salary after recount: " + rayManagement.newSalary());
        System.out.println("All money: " + rayManagement.allMoney());



        Tax tax1 = new Tax();
        Management calc = new Management(tax1, 40, true);
        System.out.println("Tax count: " + calc.calcTax());


        Employee emp1 = new Employee(200, "junior");
        Employee emp2 = new Employee(300, "Junior");
        Employee emp3 = new Employee(450, "middle");
        Employee emp4 = new Employee(700, "senior");

        Management manEmployee = new Management();
        manEmployee.addEmployee(emp1, 0);
        manEmployee.addEmployee(emp2, 1);

        System.out.print(manEmployee.getEmployee(0).getId());


    }
}
