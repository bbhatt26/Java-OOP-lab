// Q4: i is a local variable because it is declared inside a method.
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + patientId + ", Name: " + patientName + ", Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Aanya", 22),
            new Patient(2, "Rohan", 35),
            new Patient(3, "Meera", 41),
            new Patient(4, "Kabir", 18),
            new Patient(5, "Sara", 29)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
