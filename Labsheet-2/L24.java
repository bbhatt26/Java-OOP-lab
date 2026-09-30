public class L24 {
    public static void main(String[] args) {
        int[] a={5,2,9,1,7};
        int mx=a[0], mn=a[0];
        for(int x:a){ if(x>mx)mx=x; if(x<mn)mn=x; }
        System.out.println("Max="+mx+" Min="+mn);
    }
}