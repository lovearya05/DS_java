public class fun{
    public static void main(String[] args){
        int n=1;
        prt(n);
    }
    public static void prt(int n){
        if(n>5){
            System.out.println();
            return;
        }
        System.out.print(n+" ");
        prt(n+1);
        System.out.print(n+" ");
    }
}