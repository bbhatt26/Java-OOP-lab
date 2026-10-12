
class MedicineProduct {
    private String name;
    private double price;

    MedicineProduct(String n, double p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Q6 {
    public static void main(String[] args) {
        MedicineProduct m =
            new MedicineProduct("Paracetamol", 25.50);
        m.display();
    }
}
