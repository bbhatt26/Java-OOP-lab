import java.util.Scanner;
public class L19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a=sc.nextDouble(), b=sc.nextDouble();
        System.out.print("Enter operator (+,-,*,/): ");
        char op=sc.next().charAt(0);
        if(op=='+') System.out.println("Result: "+(a+b));
        else if(op=='-') System.out.println("Result: "+(a-b));
        else if(op=='*') System.out.println("Result: "+(a*b));
        else if(op=='/') System.out.println("Result: "+(a/b));
        else System.out.println("Invalid operator");
    }
}