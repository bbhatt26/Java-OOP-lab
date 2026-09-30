import java.util.Scanner;
public class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Area = " + area);
    }
}