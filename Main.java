
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker(1, "Norbert", 20000, "2021-01-01", "FullStack-Developer");
        Worker worker2 = new Worker(2, "Karol", 55000, "2021-02-01", "Designer");
        Worker worker3 = new Worker(3, "Darek", 72000, "2021-03-01", "Tester");
        Worker worker4 = new Worker(4, "Madonna", 60000, "2021-04-01", "Frontend-Developer");
        Manager manager = new Manager(5, "Alicja", 90000, "2020-05-01", "Project Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            emp.work();
            System.out.println("-" + emp.getName() + " (ID: " + emp.getId() + ", Position: " + emp.getPosition() + ", Hire date: " + emp.getHireDate() + ", Salary: " + emp.getSalary() + ")");
        }
    }
}












