public class prtArr{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=0;
        prt(arr,n);
    }
    public static void prt(int[] arr,int n){
        if(n==arr.length)return;
        System.out.print(arr[n]+" ");
        prt(arr,n+1);
    }
}