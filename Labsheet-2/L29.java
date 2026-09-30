import java.util.Random;
public class L29 {
    public static void main(String[] args) {
        Random r = new Random();
        while (true) {
            int n = r.nextInt(100) + 1;
            System.out.print(n + " ");
            if (n % 7 == 0 && n % 13 == 0) {
                System.out.println("\nFound: " + n + " divisible by 7 and 13");
                break;
            }
        }
    }
}