// Q2: Method overriding - Vehicle and Car
class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Q02_Vehicle_Car {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();

        Vehicle c = new Car();
        c.drive();
    }
}
