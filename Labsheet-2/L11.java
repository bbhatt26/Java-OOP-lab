import java.util.Scanner;
public class L11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory and practical marks: ");
        double th = sc.nextDouble(), pr = sc.nextDouble();
        double overall = (th + pr) / 2;
        if ((th >= 40 && pr >= 50) || overall >= 50) System.out.println("Pass");
        else System.out.println("Fail");
    }
}