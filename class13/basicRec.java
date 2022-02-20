public class basicRec{
    public static void main(String[] args){
        int n=1;

        inc(n);

    }
    static void inc(int n){
       if(n==5){
           System.out.println(n);
           return;
       }
       System.out.println(n);
       inc(n+1);
       System.out.println(n);
    
    }
}