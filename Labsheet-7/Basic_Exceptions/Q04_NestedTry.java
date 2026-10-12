// Q4: Nested try blocks
// Inner try: access an array element. Outer try: divide two numbers.
public class Q04_NestedTry {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {                                   // outer try
            int a = 100, b = 0;

            try {                               // inner try
                System.out.println("Accessing arr[5]...");
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }

            System.out.println("Dividing " + a + " by " + b + "...");
            System.out.println(a / b);          // throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }
        System.out.println("Program continues normally.");
    }
}
