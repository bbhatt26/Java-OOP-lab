public class L25 {
    public static void main(String[] args) {
        int[][] m={{80,90},{70,60,75},{85}};
        int sum=0,c=0;
        for(int[] r:m) for(int x:r){ sum+=x; c++; }
        System.out.println("Average="+(double)sum/c);
    }
}