
class Medicine {
    String name;
    double price;

    Medicine(String n, double p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
    }
}

class Q2 {
    public static void main(String[] args) {
        Medicine m = new Medicine("Paracetamol", 25.50);
        m.display();
    }
}
