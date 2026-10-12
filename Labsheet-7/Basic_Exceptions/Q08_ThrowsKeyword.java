// Q8: Using the throws keyword
import java.util.Scanner;

public class Q08_ThrowsKeyword {
    static int readNumber() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.nextLine();
        return Integer.parseInt(s.trim());      // may throw NumberFormatException
    }

    public static void main(String[] args) {
        try {
            int n = readNumber();
            System.out.println("You entered: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, not an integer: " + e.getMessage());
        }
    }
}
