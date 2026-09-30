import java.util.Scanner;
public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P, R, T: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double amount = p * Math.pow((1 + r/100), t);
        System.out.println("Compound Interest = " + (amount - p));
        System.out.println("Amount = " + amount);
    }
}