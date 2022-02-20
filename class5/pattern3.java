public class pattern3{
    public static void main(String[] args){
        int n=5;
        int nst=1;
        int nsp=2*n-3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            if(i==n){
                nst--;
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            nst++;
            nsp-=2;
        }
    }
}