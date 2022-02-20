import java.util.Scanner;
public class maxArray{
    public static void main(String[] args)
    {
        int arr[]={1,2,37,45,6,5};  
        max(arr);
    }
    static void max(int[] arr){
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        System.out.println(m);
    }
}