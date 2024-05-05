

import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Norbert", 20000, 1, "2023-01-01", "Web Developer"));
        employees.add(new Worker("Karol", 52000, 2, "2023-02-15", "DevOps Developer"));
        employees.add(new Worker("Darek", 70000, 1, "2023-01-01", "Software Engineer"));
        employees.add(new Manager("Madonna", 60000, 3, "2023-05-01", "Team Leader"));
        employees.add(new Worker("William", 75000, 2, "2023-03-01", "Tester"));
        employees.add(new Manager("Morgan Freeman", 92000, 4, "2023-06-01", "Project Manager"));

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        Map<Integer, Integer> idCount = new HashMap<>();

        for (Employee emp : employees) {
            totalSalary += emp.getSalary();

            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }

            idCount.put(emp.getId(), idCount.getOrDefault(emp.getId(), 0) + 1);
        }

        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total salary for Managers: " + totalManagerSalary);
        System.out.println("Total salary for Workers: " + totalWorkerSalary);

        System.out.println("Employees with duplicate IDs:");
        for (Map.Entry<Integer, Integer> entry : idCount.entrySet()) {
            if (entry.getValue() > 1) {


            }
        }
    }
}






















