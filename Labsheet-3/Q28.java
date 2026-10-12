
import java.util.Scanner;

class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        boolean found = false;

        System.out.println("Enter 9 elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == key) {
                    System.out.println(
                        "Found at row " + (i + 1) +
                        ", column " + (j + 1)
                    );
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
