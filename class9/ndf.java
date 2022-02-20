import java.util.Scanner;
public class ndf{
    public static void main(String[] args)
    {
         int[] arr={1,0,1,0,1,1,1,0,0,1};
         ndf(arr);
        display(arr);
    }

    static void ndf(int[] arr){
      int zero=-1;
      int one=arr.length-1;
      int i=0;

      while(i<one){
          if(arr[i]==0){
              zero++;
              i++;

          }else{
              int temp=arr[i];
              arr[i]=arr[one];
              arr[one]=temp;
              one--;
          }
       }
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    
    
}