
class Employee {
    void display() {
        System.out.println("Hospital Employee");
    }
}

class Doctor extends Employee {
    void treatPatients() {
        System.out.println("Doctor treats patients");
    }
}

class Pharmacist extends Employee {
    void provideMedicine() {
        System.out.println("Pharmacist provides medicine");
    }
}

class Q10 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Pharmacist p = new Pharmacist();

        d.display();
        d.treatPatients();

        p.display();
        p.provideMedicine();
    }
}
