import java.util.Scanner;
public class L11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        if(a>b) {
            if(a>c) System.out.println(a+" largest");
            else System.out.println(c+" largest");
        } else {
            if(b>c) System.out.println(b+" largest");
            else System.out.println(c+" largest");
        }
    }
}