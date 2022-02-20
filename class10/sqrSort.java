public class sqrSort{
    public static void main(String[] args)
    {
       int[] arr={-4,-1,0,3,10};
       int[] brr=new int[arr.length];
       sol(arr,brr);
       display(brr);
    }   
    static void sol(int[] arr,int[] brr){
        int fp=arr[0];
        int l=arr.length-1;
        int lp=arr[l];
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(fp*fp>lp*lp){
               brr[i]=fp*fp;
               fp=arr[++a];

            }else{
               brr[i]=lp*lp;
               lp=arr[--l];
            }
        }
    }    
    static void display(int[] brr){
        for(int i=0;i<brr.length;i++){
            System.out.print(" "+brr[i]);
        }
    }
}