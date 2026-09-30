import java.util.Scanner;
public class L27 {
    public static void main(String[] args) {
        char g=new Scanner(System.in).next().charAt(0);
        switch(g){
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Poor"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid");
        }
    }
}