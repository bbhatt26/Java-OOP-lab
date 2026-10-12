// Q3: Method overriding - Shape and Rectangle
class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class Q03_Shape_Rectangle {
    public static void main(String[] args) {
        Shape s = new Rectangle(10, 5);
        System.out.println("Area of rectangle = " + s.getArea());
    }
}
