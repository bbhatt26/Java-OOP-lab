import java.util.Scanner;
public class L14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch=sc.next().charAt(0);
        if(ch>='0' && ch<='9') System.out.println("Digit");
        else if(ch>='A' && ch<='Z') System.out.println("Uppercase");
        else if(ch>='a' && ch<='z') System.out.println("Lowercase");
        else System.out.println("Special character");
    }
}