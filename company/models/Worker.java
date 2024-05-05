package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {
    public Worker(int id, String name, double salary, String hireDate, String position) {
        super(id, name, salary, hireDate, position);
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }
}

