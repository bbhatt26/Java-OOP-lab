import java.util.Scanner;
public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 3 subjects: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        int total = m1+m2+m3;
        float per = total/3.0f;
        System.out.println("Total: "+total+" Percentage: "+per);
        if(m1>=40 && m2>=40 && m3>=40) System.out.println("Pass");
        else System.out.println("Fail");
    }
}
