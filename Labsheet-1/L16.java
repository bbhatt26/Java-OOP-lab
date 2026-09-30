import java.util.Scanner;
public class L16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double s=sc.nextDouble(), tax=0;
        if(s<=250000) tax=0;
        else if(s<=500000) tax=s*0.05;
        else if(s<=1000000) tax=s*0.20;
        else tax=s*0.30;
        System.out.println("Tax: "+tax);
    }
}