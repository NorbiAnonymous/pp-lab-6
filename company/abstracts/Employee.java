package company.abstracts;

import company.interfaces.Employable;

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;
    private String hireDate;
    private String position;

    public Employee(int id, String name, double salary, String hireDate, String position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
