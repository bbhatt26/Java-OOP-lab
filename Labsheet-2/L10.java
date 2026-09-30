import java.util.Scanner;
public class L10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year, start, end: ");
        int y = sc.nextInt(), s = sc.nextInt(), e = sc.nextInt();
        boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        if (leap && y >= s && y <= e) System.out.println("Leap year in range");
        else System.out.println("Not satisfied");
    }
}