import java.util.Scanner;
public class L16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num and power: ");
        int n = sc.nextInt(), p = sc.nextInt();
        System.out.println("Mul by 2^"+p+" = " + (n << p));
        System.out.println("Div by 2^"+p+" = " + (n >> p));
    }
}