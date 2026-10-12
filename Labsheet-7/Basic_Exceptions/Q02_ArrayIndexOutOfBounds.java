// Q2: ArrayIndexOutOfBoundsException
import java.util.Scanner;

public class Q02_ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an index (0-4): ");
        int index = sc.nextInt();
        try {
            System.out.println("Value at index " + index + " = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Array has only 5 elements (" + e.getMessage() + ")");
        }
        sc.close();
    }
}
