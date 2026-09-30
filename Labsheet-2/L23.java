import java.util.Scanner;
public class L23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), o=n, r=0;
        while(n!=0){ r=r*10+n%10; n/=10; }
        System.out.println(o==r?"Palindrome":"Not palindrome");
    }
}