import java.util.Scanner;
public class L30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // 1. Check power of 4 using shift / bitwise
        boolean isPow4 = n > 0 && (n & (n - 1)) == 0 && (Integer.numberOfTrailingZeros(n) % 2 == 0);
        System.out.println(n + (isPow4 ? " is" : " is not") + " a power of 4");

        // 2. Toggle 3rd bit (bit position 2, 0-indexed)
        int toggled = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit: " + toggled);

        // 3 & 4. Multiplication table, skip multiples of 6, stop at multiple of 48
        System.out.println("Multiplication table of " + toggled + ":");
        for (int i = 1; i <= 10; i++) {
            int val = toggled * i;
            if (val % 48 == 0) {
                System.out.println(val + " -> multiple of 48, stopping");
                break;
            }
            if (val % 6 == 0) continue;
                    System.out.println(toggled + " x " + i + " = " + val);
    }
    sc.close();
    }
}