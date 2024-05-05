package company.models;

import company.abstracts.Employee;

public class Manager extends Employee {
    public Manager(int id, String name, double salary, String hireDate, String position) {
        super(id, name, salary, hireDate, position);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");
    }
}

