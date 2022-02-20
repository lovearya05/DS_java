import java.util.Scanner;
public class spiral{
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
        int rmin=0;
        int rmax=arr.length-1;
        int cmin=0;
        int cmax=arr[0].length-1;
        int toe=arr.length*arr[0].length;

        while(toe!=0){
            //top wall
            for(int i=cmin;i<=cmax;i++){
                System.out.print(arr[rmin][i]+" ");
                toe--;
            }
            rmin++;
            //right wall
            for(int i=rmin;i<=rmax && toe!=0;i++){
                System.out.print(arr[i][cmax]+" ");
                toe--;
            }
            cmax--;

            //bottom wall
            for(int i=cmax;i>=cmin && toe!=0;i--){
                System.out.print(arr[rmax][i]+" ");
                toe--;
            }
            rmax--;
            //left wall
            for(int i=rmax;i>=rmin && toe!=0;i--){
                System.out.print(arr[i][cmin]+" ");
                toe--;
            }
            cmin++;
        }
    }
    
}