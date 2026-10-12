
import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (a[i] == b[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                b[count] = a[i];
                count++;
            }
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
