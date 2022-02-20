import java.util.Scanner;
public class bar{
    public static void main(String[] args)
    {
        int arr[]={1,2,6,0,6,5,7,2}; 
        max(arr);
        bar(arr);
    }
    static int max(int[] arr){
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    static void bar(int[] arr){
      int maxval=max(arr);
      for(int i=maxval;i>=1;i--){
          for(int j=0;j<arr.length;j++){
              if(arr[j]>=i){
                  System.out.print("*  ");

              }else{
                  System.out.print("   ");
              }
            }
          System.out.println();
        }        
    }
}