import java.util.Scanner;
public class L18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        boolean prime = n>1;
        for(int i=2;i<=n/2;i++) if(n%i==0){prime=false;break;}
        if(prime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}