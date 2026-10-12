
import java.util.Scanner;

class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int mainSum = 0, secondarySum = 0;

        System.out.println("Enter 9 elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            mainSum += a[i][i];
            secondarySum += a[i][2 - i];
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
        sc.close();
    }
}
