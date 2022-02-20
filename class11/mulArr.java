//                      Array multiplication
import java.util.Scanner;
public class mulArr{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int[][] arr=new int[r1][c1];
        input(arr);

        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] brr=new int[r2][c2]; 
        input(brr);

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