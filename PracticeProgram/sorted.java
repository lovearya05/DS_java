import java.util.*;
import java.lang.*;
import java.io.*;

public class sorted{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        int count=n;
        int ans=0;
        int i=0,sum=0;

        for( i=0;i<n;i++ ){
            arr[i]=sc.nextInt();
        }

        for( i=0;i<n;i++) {
            sum=sum+arr[i];
        }

        for( i=0;i<n;i++) {
            int total=sum/n;
            if(total==arr[i]){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}