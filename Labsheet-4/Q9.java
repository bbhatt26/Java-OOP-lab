
class Employee {
    String name = "Rahul";

    void displayEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Pharmacist extends Employee {
    void displayRole() {
        System.out.println("Role: Pharmacist");
    }
}

class Q9 {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist();
        p.displayEmployee();
        p.displayRole();
    }
}
