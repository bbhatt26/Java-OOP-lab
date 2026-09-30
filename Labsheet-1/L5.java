import java.util.Scanner;
public class L5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter float: ");
        float f = sc.nextFloat();
        int i = (int) f;
        System.out.println("Original: " + f);
        System.out.println("Converted: " + i);
    }
}