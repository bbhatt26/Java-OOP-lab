
class HospitalSystem {
    private String hospitalName;

    HospitalSystem(String name) {
        hospitalName = name;
    }

    class Employee {
        private String name;

        Employee(String n) {
            name = n;
        }

        void display() {
            System.out.println("Employee: " + name);
        }
    }

    class Pharmacist extends Employee {
        Pharmacist(String n) {
            super(n);
        }

        void display() {
            System.out.println("Hospital: " + hospitalName);
            super.display();
            System.out.println("Role: Pharmacist");
        }
    }

    void run() {
        Pharmacist p = new Pharmacist("Rahul");
        p.display();
    }
}

class Q15 {
    public static void main(String[] args) {
        HospitalSystem system =
            new HospitalSystem("City Hospital");
        system.run();
    }
}
