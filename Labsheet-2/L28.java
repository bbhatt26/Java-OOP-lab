public class L28 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            int s=(int)Math.sqrt(i);
            if(s*s==i) continue;
            System.out.print(i+" ");
        }
    }
} 