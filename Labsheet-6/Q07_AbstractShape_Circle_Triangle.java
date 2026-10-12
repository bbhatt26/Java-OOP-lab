// Q7: Abstract Shape with calculateArea() and calculatePerimeter()
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {            // Heron's formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class Q07_AbstractShape_Circle_Triangle {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        System.out.printf("Circle   -> Area: %.2f, Perimeter: %.2f%n",
                circle.calculateArea(), circle.calculatePerimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.printf("Triangle -> Area: %.2f, Perimeter: %.2f%n",
                triangle.calculateArea(), triangle.calculatePerimeter());
    }
}
