
class Pharmacy {
    static String name = "HealthCare Pharmacy";
    static String location = "Delhi";

    void display() {
        System.out.println(name + " - " + location);
    }
}

class Q3 {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy();
        Pharmacy p2 = new Pharmacy();

        p1.display();
        p2.display();

        Pharmacy.location = "Noida";

        p1.display();
        p2.display();
    }
}
