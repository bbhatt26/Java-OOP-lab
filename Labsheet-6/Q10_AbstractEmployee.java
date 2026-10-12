// Q10: Abstract Employee with Manager and Programmer
abstract class Employee {
    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double basic, bonus;

    Manager(String name, int id, double basic, double bonus) {
        super(name, id);
        this.basic = basic;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basic + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager    | ID: " + id + " | Name: " + name
                + " | Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    Programmer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer | ID: " + id + " | Name: " + name
                + " | Salary: " + calculateSalary());
    }
}

public class Q10_AbstractEmployee {
    public static void main(String[] args) {
        Employee m = new Manager("Anita", 101, 80000, 15000);
        Employee p = new Programmer("Rohit", 102, 500, 160);
        m.displayInfo();
        p.displayInfo();
    }
}
