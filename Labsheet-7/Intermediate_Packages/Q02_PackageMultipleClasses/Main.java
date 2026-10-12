import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        System.out.printf("Area of circle    = %.2f%n", c.area());
        System.out.printf("Area of rectangle = %.2f%n", r.area());
    }
}
