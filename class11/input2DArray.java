import java.util.Scanner;
public class input2DArray{
     static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
      
        //System.out.println("enter size of array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];  
        input(arr);
        display(arr);
    }

    static void input(int[][] arr){
        //Scanner s1=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            //System.out.println("enter value of row " +i);
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}