//                      Array Addition
import java.util.Scanner;
public class matrix{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter No of row and colum of matrix 1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] arr=new int[r1][c1];
        System.out.println("Enter element to matrix 1");
        input(arr);
        
        System.out.println("enter No of row and colum of matrix 2");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] brr=new int[r2][c2]; 
        System.out.println("Enter element to matrix 2");
        input(brr);

        if(r1!=r2 || c1!=c2){
         System.out.println("Addion not possible");
         return;
        }

        int[][] ans=new int[r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ans[i][j]=arr[i][j]+brr[i][j];
            }
        }
        System.out.println("addition");
        display(ans);
        System.out.println("subtraction");
        if(r1!=r2 || c1!=c2){
            System.out.println("Addion not possible");
            return;
           }
   
           int[][] sub=new int[r1][c1];
   
           for(int i=0;i<r1;i++){
               for(int j=0;j<c1;j++){
                   sub[i][j]=arr[i][j]-brr[i][j];
               }
           }
           display(sub);
        System.out.println("Multiplication");
        multiply(arr,brr);

    }
    static void multiply(int[][] arr,int[][] brr){
        int r1=arr.length;
        int r2=brr.length;
        int c1=arr[0].length;
        int c2=brr[0].length;
        
        if(c1!=r2){
            System.out.println("multiplication not possible");
            return;
        }
        int[][] ans=new int[r1][r2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<c1;k++){
                   sum+=arr[i][k]*brr[k][j];
                }
                ans[i][j]=sum;
            }
        }
        display(ans);

    }
    static void input(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void display(int[][] crr){
        for(int i=0;i<crr.length;i++){
            for(int j=0;j<crr[0].length;j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
    }
}