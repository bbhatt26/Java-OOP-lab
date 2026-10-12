
class Person {
    void showPerson() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("Employee");
    }
}

class Doctor extends Employee {
    void showDoctor() {
        System.out.println("Doctor");
    }
}

class Pharmacist extends Person {
    void showPharmacist() {
        System.out.println("Pharmacist");
    }
}

class Q13 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Pharmacist p = new Pharmacist();

        d.showPerson();
        d.showEmployee();
        d.showDoctor();

        p.showPerson();
        p.showPharmacist();
    }
}
