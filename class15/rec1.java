public class rec1{
    public static void main(String[] args){
        int n=3;
        //fun(n);
        fun2(n);
    }
    public static void fun(int n){
        if(n==0)return;
        System.out.print("A ");
        fun(n-1);
        System.out.print("B ");
        fun(n-1);
        System.out.print("C ");
    }
    public static void fun2(int n){
        if(n<=0)return;
        System.out.print("A ");
        fun(n-1);
        System.out.print("B ");
        fun(n-2);
        System.out.print("C ");
    }
}