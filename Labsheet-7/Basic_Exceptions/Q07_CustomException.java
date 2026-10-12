// Q7: User-defined exception - InvalidPasswordException
import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class Q07_CustomException {
    static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must have at least 6 characters.");
        }
        System.out.println("Password accepted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();
        try {
            validatePassword(pwd);
        } catch (InvalidPasswordException e) {
            System.out.println("InvalidPasswordException: " + e.getMessage());
        }
        sc.close();
    }
}
