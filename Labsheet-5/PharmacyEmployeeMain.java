// Q20: Encapsulation, inheritance, static counting, access control and processing.
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount = 0;
    protected String department = "Pharmacy";

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    // Default-access method: available to classes in the same package.
    void displayBasicDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName
                + ", Salary: Rs. " + salary + ", Department: " + department);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayRole() {
        displayBasicDetails();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class StoreManager extends Employee {
    private String storeSection;

    StoreManager(int employeeId, String employeeName, double salary, String storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    void displayRole() {
        displayBasicDetails();
        System.out.println("Role: Store Manager, Section: " + storeSection);
    }
}

class EmployeeProcessor {
    void processEmployees(Employee[] employees) {
        int total = 0; // Local variable
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Pharmacist) {
                ((Pharmacist) employees[i]).displayRole();
                total++;
            } else if (employees[i] instanceof StoreManager) {
                ((StoreManager) employees[i]).displayRole();
                total++;
            }
            System.out.println();
        }
        System.out.println("Employees processed: " + total);
        System.out.println("Total Employee objects created: " + Employee.employeeCount);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(201, "Aman", 32000, "PH-778"),
            new StoreManager(202, "Neha", 45000, "Inventory")
        };

        EmployeeProcessor processor = new EmployeeProcessor();
        processor.processEmployees(employees);
    }
}
