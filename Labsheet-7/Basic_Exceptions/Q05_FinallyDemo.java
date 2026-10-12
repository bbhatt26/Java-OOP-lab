// Q5: finally block always runs
public class Q05_FinallyDemo {
    public static void main(String[] args) {
        System.out.println("File opened");
        try {
            System.out.println("Performing operation...");
            int x = 10 / 0;                     // exception occurs
            System.out.println("This line is never printed: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Resource closed");
        }
    }
}
