import java.util.Scanner;
public class L20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do { System.out.print("Enter password: "); pass=sc.nextLine(); }
        while(!pass.equals("java123"));
        System.out.println("Access granted");
    sc.close();
    }
}