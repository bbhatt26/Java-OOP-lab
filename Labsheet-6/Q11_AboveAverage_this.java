// Q11: Read ten numbers, compute average, count numbers above average (uses 'this')
import java.util.Scanner;

class NumberStats {
    private double[] numbers;
    private int size;

    NumberStats(int size) {
        this.size = size;                 // 'this' separates field from parameter
        this.numbers = new double[size];
    }

    void readNumbers(Scanner sc) {
        for (int i = 0; i < this.size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            this.numbers[i] = sc.nextDouble();
        }
    }

    double average() {
        double sum = 0;
        for (double n : this.numbers) {
            sum += n;
        }
        return sum / this.size;
    }

    int countAboveAverage() {
        double avg = this.average();      // calling another method using 'this'
        int count = 0;
        for (double n : this.numbers) {
            if (n > avg) {
                count++;
            }
        }
        return count;
    }
}

public class Q11_AboveAverage_this {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberStats stats = new NumberStats(10);
        stats.readNumbers(sc);
        System.out.println("Average = " + stats.average());
        System.out.println("Numbers above average = " + stats.countAboveAverage());
        sc.close();
    }
}
