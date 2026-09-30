import java.util.Scanner;
public class L12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int min = (a < b ? a : b) < (c < d ? c : d) ? (a < b ? a : b) : (c < d ? c : d);
        System.out.println("Smallest = " + min);
    }
}