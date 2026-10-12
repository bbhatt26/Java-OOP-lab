
import java.util.Scanner;

class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second largest does not exist");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int second = 0;
        boolean found = false;

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
                found = true;
            } else if (a[i] < largest &&
                    (!found || a[i] > second)) {
                second = a[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("Second largest = " + second);
        } else {
            System.out.println("Second largest does not exist");
        }
        sc.close();
    }
}
