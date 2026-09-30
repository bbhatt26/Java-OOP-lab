public class L19 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            int n=i,s=0,t=i;
            while(t>0){ int d=t%10; s+=d*d*d; t/=10; }
            if(s==i) System.out.print(i+" ");
        }
    }
}