import java.util.Scanner;
public class L7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.print("Day " + i + " rainfall: ");
            total += sc.nextDouble();
        }
        System.out.println("Total rainfall = " + total);
    }
}