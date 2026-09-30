import java.util.Scanner;
public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num = sc.nextDouble();
        int steps = 0;
        while (num >= 1) {
            num /= 2;
            steps++;
        }
        System.out.println("Steps = " + steps + ", Final = " + num);
    }
}