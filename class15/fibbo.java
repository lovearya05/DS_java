public class fibbo{
    public static void main(String[] args){
        int n=21;
        int a=0;
        int b=1;
        fibbonaci(a,b,n);
    }
    static void fibbonaci(int a,int b,int n){
        System.out.print(a+" ");
        int temp=a;
        a=b;
        b=a+temp;
        if(a>n)return;
        fibbonaci(a,b,n);
        }
}