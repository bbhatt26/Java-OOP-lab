import java.util.Scanner;
public class L17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int r = (n << 2) | (n >>> 30);
        System.out.println("Rotated = " + r);
    }
}