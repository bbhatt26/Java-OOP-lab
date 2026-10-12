// Q4: Employee and HRManager (override work(), add addEmployee())
class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is doing general work.");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " is managing recruitment and employee relations.");
    }

    void addEmployee(String empName) {
        System.out.println(name + " (HR) added new employee: " + empName);
    }
}

public class Q04_Employee_HRManager {
    public static void main(String[] args) {
        Employee e = new Employee("Ravi", 30000);
        e.work();
        System.out.println("Salary: " + e.getSalary());

        HRManager hr = new HRManager("Anita", 60000);
        hr.work();
        hr.addEmployee("Suresh");
        System.out.println("Salary: " + hr.getSalary());
    }
}
