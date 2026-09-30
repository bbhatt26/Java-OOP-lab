import java.util.Scanner;
public class L20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        System.out.print("Enter gender (M/F): ");
        char g=Character.toUpperCase(sc.next().charAt(0));
        if(g=='M'){
            if(age>=21) System.out.println("Eligible");
            else System.out.println("Not eligible");
        } else if(g=='F'){
            if(age>=18) System.out.println("Eligible");
            else System.out.println("Not eligible");
        } else System.out.println("Invalid gender");
    }
}