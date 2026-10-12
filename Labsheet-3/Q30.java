
import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int zero = 0, nonZero = 0;

        System.out.println("Enter 9 elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0) {
                    zero++;
                } else {
                    nonZero++;
                }
            }
        }

        System.out.println("Zero elements = " + zero);
        System.out.println("Non-zero elements = " + nonZero);

        if (zero > nonZero) {
            System.out.println("It is a sparse matrix");
        } else {
            System.out.println("It is not a sparse matrix");
        }
        sc.close();
    }
}

