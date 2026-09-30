import java.util.Scanner;
public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Add: " + (a+b));
        System.out.println("Sub: " + (a-b));
        System.out.println("Mul: " + (a*b));
        System.out.println("Div: " + (a/(float)b));
        System.out.println("Mod: " + (a%b));
    }
}