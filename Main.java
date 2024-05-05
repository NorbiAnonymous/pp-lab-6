import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Norbert", 20000, 1);
        Worker worker2 = new Worker("Karol", 32000, 2);
        Worker worker3 = new Worker("Darek", 64000, 3);
        Worker worker4 = new Worker("Madonna", 76000, 4);
        Manager manager = new Manager("Alicja", 90000, 5);

        Worker[] workers = { worker1, worker2, worker3, worker4 };

        for (Worker worker : workers) {
            System.out.println(worker.getSalary());
            worker.work();
        }

        System.out.println(manager.getSalary());
        manager.work();
    }
}









