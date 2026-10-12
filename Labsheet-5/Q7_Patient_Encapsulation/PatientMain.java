// Q7: Setters can validate data before updating private fields.
class Patient{
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        setAge(age);
        setWeight(weight);
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be 0 or more.");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight. Weight must be greater than 0.");
        }
    }

    void displayPatient() {
        System.out.println("Name: " + patientName + ", Age: " + age + ", Weight: " + weight);
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Aanya", 22, 49.5);
        patient.setAge(23);       // Valid value
        patient.setAge(-2);       // Invalid value
        patient.setWeight(50.0);  // Valid value
        patient.setWeight(0);     // Invalid value
        patient.displayPatient();
    }
}
