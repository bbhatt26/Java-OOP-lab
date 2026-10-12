
class Person {
    void showPerson() {
        System.out.println("Person details");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("Employee details");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("Manager details");
    }
}

class Q11 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}
