// Q6: Using the throw keyword
public class Q06_ThrowKeyword {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age " + age + " is not eligible (must be 18+).");
        }
        System.out.println("Age " + age + " is eligible.");
    }

    public static void main(String[] args) {
        try {
            checkAge(25);
            checkAge(15);                       // throws
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
