import java.util.Scanner;
public class L12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        if((y%400==0) || (y%4==0 && y%100!=0)) System.out.println("Leap year");
        else System.out.println("Not leap year");
    }
}