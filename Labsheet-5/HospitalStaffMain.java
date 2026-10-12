// Q19: Person is the top-level parent; Doctor and Pharmacist inherit through Employee.
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount = 0;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    int getEmployeeId() {
        return employeeId;
    }

    double getSalary() {
        return salary;
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId + ", Name: " + name
                + ", Age: " + age + ", Salary: Rs. " + salary);
    }

    static void displayEmployeeCount() {
        System.out.println("Total employees created: " + employeeCount);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Role: Doctor, Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class StaffManager {
    void displayStaff(Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor) {
                ((Doctor) staff[i]).displayDoctor();
            } else if (staff[i] instanceof Pharmacist) {
                ((Pharmacist) staff[i]).displayPharmacist();
            }
            System.out.println();
        }
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Mehta", 40, 101, 75000, "Cardiology"),
            new Pharmacist("Riya", 28, 102, 35000, "PH-202")
        };

        StaffManager manager = new StaffManager();
        manager.displayStaff(staff);
        Employee.displayEmployeeCount();
    }
}
