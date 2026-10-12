
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    void area() {
        System.out.println("Rectangle area: " +
            (length * breadth));
    }
}

class Circle extends Shape {
    double radius = 7;

    void area() {
        System.out.println("Circle area: " +
            (3.14 * radius * radius));
    }
}

class Q14 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.area();
        c.area();
    }
}
