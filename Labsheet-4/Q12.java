
class Doctor {
    void treat() {
        System.out.println("Doctor treats patients");
    }
}

class Pharmacist {
    void provideMedicine() {
        System.out.println("Pharmacist provides medicine");
    }
}

// Java does not allow:
// class HospitalStaff extends Doctor, Pharmacist

class Q12 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Pharmacist p = new Pharmacist();

        d.treat();
        p.provideMedicine();
    }
}
