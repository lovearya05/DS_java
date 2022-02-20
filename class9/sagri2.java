import java.util.Scanner;
public class sagri2{
    public static void main(String[] args)
    {
         int[] arr={1,-2,1,-2,1,-2,-1,1,-2,1};
         ndf(arr);
        display(arr);
    }

    static void ndf(int[] arr){
      int zero=-1;
      int al=arr.length-1;
      int i=0;

      while(i<al){
          if(arr[i]<0){
              zero++;
              i++;

          }else{
              int temp=arr[i];
              arr[i]=arr[al];
              arr[al]=temp;
              al--;
          }
       }
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    
    
}