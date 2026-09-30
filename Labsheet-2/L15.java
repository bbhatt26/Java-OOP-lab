import java.util.Scanner;
public class L15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), c = 0;
        while (n > 0) { c += (n & 1); n >>= 1; }
        System.out.println("Set bits = " + c);
        sc.close();
    }
}