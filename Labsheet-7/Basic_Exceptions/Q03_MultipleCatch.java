// Q3: Multiple catch blocks - NumberFormatException and ArithmeticException
import java.util.Scanner;

public class Q03_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second number: ");
        String s2 = sc.nextLine();
        try {
            int a = Integer.parseInt(s1.trim());
            int b = Integer.parseInt(s2.trim());
            System.out.println("Result = " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
        sc.close();
    }
}
