//                                                 Array Search
import java.util.Scanner;
public class arraySearch{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int[][] arr=new int[r1][c1];
        input(arr);
        int num=22;
        search(arr,num);        
    }
    static void search(int[][] arr,int num){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            int j=0;
            if(arr[i][j]>num){
                for(j=0;j<arr[0].length;j++){
                    if(arr[i-1][j]==num){
                        System.out.println("element at index "+i+"-"+j);
                        flag=true;
                        return;
                    }
                }
            }
            //System.out.println(i);
        }
            if(flag==false){
             System.out.println("element not found");
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