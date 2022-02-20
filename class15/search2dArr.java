//                                                 Array Search
import java.util.Scanner;
public class search2dArr{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int[][] arr=new int[r1][c1];
        input(arr);
        int num=32;
        search(arr,num);        
    }
    static void search(int[][] arr,int num){
        int i=0;
        int j=arr.length-1;
       while(true){
           if(arr[i][j]==num){
               System.out.print(i+"-"+j);
               return;
           }
           if(arr[i][j]<num) i++;
           if(i==arr.length){
               System.out.print("element not found");
               return;
           }
           if(arr[i][j]>num) j--;
           if(j==-1){
               System.out.print("element not found");
               return;
           }

       }
    }
    static void input(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
}