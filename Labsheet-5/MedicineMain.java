// Q2: this refers to the current object.
class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine medicine1 = new Medicine("Paracetamol", "B101", 25.50);
        Medicine medicine2 = new Medicine("Cetirizine", "B205", 42.00);
        medicine1.displayMedicine();
        medicine2.displayMedicine();
    }
}
