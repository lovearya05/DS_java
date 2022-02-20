                             // Matrix Rotation By 90॰

import java.util.Scanner;
public class RotateMatrix{
     static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] arr=new int[r1][c1];
        input(arr);
        rotate(arr);
    }
    static void rotate(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        //transpose
        for(int i=1;i<r;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<arr.length;i++){
            reverse(arr,i);
        }
         display(arr);
    }
static void reverse(int[][] arr,int r){
    int i=0;
    int j=arr[0].length-1;

    while(i<j){
        int temp=arr[r][i];
        arr[r][i]=arr[r][j];
        arr[r][j]=temp;
        i++;
        j--;
    }
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

