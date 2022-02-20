public class power{
    public static void main(String[] args){
        int n=4;
        System.out.println(pow(n));
    }
    static int pow(int n){
       if(n==0) return 1;
       int reans=pow(n/2);

       if(n%2==0){
           return reans*reans;
       }
       return (reans*reans*2);
    }
}