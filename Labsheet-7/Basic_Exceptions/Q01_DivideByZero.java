// Q1: Divide by zero - try-catch-finally
import java.util.Scanner;

public class Q01_DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero (" + e.getMessage() + ")");
        } finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}
