
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Norbert", 20000, 1, "2023-01-01", "Web Developer");
        Worker worker2 = new Worker("Karol", 52000, 2, "2023-02-15", "DevOps Developer");
        Worker worker3 = new Worker("Darek", 80000, 1, "2023-01-01", "Software Engineer");
        Manager manager = new Manager("Madonna", 90000, 3, "2023-05-01", "Team Leader");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " has code: " + emp.hashCode());
        }

        System.out.println("Comparing workers with same ID:");
        for (Employee emp : employees) {
            if (worker1.equals(emp)) {
                System.out.println(worker1.getName() + " equals " + emp.getName());
            }
        }
    }
}

















