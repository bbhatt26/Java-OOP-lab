import java.util.Scanner;
public class L8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 angles: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a + b + c == 180 && a > 0 && b > 0 && c > 0)
            System.out.println("Valid triangle");
        else
            System.out.println("Not valid");
    }
}