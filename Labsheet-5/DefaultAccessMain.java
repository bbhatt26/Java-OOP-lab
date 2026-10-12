// Q11: No access keyword means default (package-private) access.
class Pharmacy {
    String medicineName;
    double price;

    Pharmacy() {
        medicineName = "Vitamin C";
        price = 80.0;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: Rs. " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        // These default-access members are available in the same package.
        System.out.println(pharmacy.medicineName);
        System.out.println(pharmacy.price);
        pharmacy.displayMedicine();
    }
}
