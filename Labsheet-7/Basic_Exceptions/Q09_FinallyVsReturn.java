// Q9: finally vs return
public class Q09_FinallyVsReturn {
    static int test() {
        try {
            System.out.println("1. Inside try block");
            return 10;                          // return value is evaluated & saved here...
        } finally {
            System.out.println("2. Inside finally block");   // ...but finally runs BEFORE the method returns
        }
    }

    public static void main(String[] args) {
        int value = test();
        System.out.println("3. Method returned: " + value);

        /* Explanation:
           The return statement in try is evaluated first, but the method does not
           actually return until the finally block has finished. So the order is:
           try body -> finally -> value returned to the caller. */
    }
}
