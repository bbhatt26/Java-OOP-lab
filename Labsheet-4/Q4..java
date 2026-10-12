
class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String n, int q) {
        name = n;
        quantity = q;
    }
}

class Inventory {
    MedicineStock[] stock = {
        new MedicineStock("Paracetamol", 50),
        new MedicineStock("Cetirizine", 30),
        new MedicineStock("Vitamin C", 40)
    };

    void display() {
        for (int i = 0; i < stock.length; i++) {
            System.out.println(
                stock[i].name + " : " + stock[i].quantity
            );
        }
    }
}

class Q4 {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.display();
    }
}
