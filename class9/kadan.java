import java.util.Scanner;
public class kadan{
    public static void main(String[] args)
    {
         int[] arr={2,-3,5,-8,5,-1,3,4,-5,5};
         kadan(arr);
       
    }

    static void kadan(int[] arr){
       int bs=arr[0];
       int cs=arr[0];
       int bi=0; int bj=0;
       int ci=0; int cj=0;
       for(int i=1;i<arr.length;i++){
           if(cs>=0){
               cs+=arr[i];
               cj++;
           }else{
               cs=arr[i];
               ci=i;
               cj=i;

           }
           if(cs>bs){
               bs=cs;
               bi=ci;
               bj=cj;
           }
       }
       for(int i=bi;i<=bj;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println("=>"+bs);
    }
    
}