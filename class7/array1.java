import java.util.Scanner;
public class array1{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];  
        input(arr);
        display(arr);
    }

    static void input(int[] arr){
        Scanner s1=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter value of index " +i);
            arr[i]=s1.nextInt();
        }
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("value of index "+i +" is "+arr[i]);
        }
    }
    
}