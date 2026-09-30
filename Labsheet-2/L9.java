import java.util.Scanner;
public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 strings: ");
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int len = Math.min(s1.length(), s2.length());
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) < s2.charAt(i)) { result = -1; break; }
            if (s1.charAt(i) > s2.charAt(i)) { result = 1; break; }
        }
        if (result == 0) {
            if (s1.length() < s2.length()) result = -1;
            else if (s1.length() > s2.length()) result = 1;
        }
        System.out.println(result < 0 ? s1 + " < " + s2 : result > 0 ? s1 + " > " + s2 : "Equal");
    }
}