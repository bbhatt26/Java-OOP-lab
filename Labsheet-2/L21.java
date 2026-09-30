import java.util.Scanner;
public class L21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt(), i=1;
        do { if(n%i==0) System.out.print(i+" "); i++; } while(i<=n);
    }
}