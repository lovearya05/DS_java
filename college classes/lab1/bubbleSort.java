import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        int count=1;
        int[] arr={6,8,3,1,0,9,7};

        bubbleSort(arr,count);
        display(arr);
        
    }

    static void bubbleSort(int[] arr,int count){
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
            if(flag){
                count++;
                flag=false;
            }
        }

        System.out.println("\tSteps - "+count);
    }

    static void swap(int[] arr,int a,int b){
        // int temp=arr[a];
        // arr[a]=arr[b];
        // arr[b]=temp;

        // arr[a]=arr[a]+arr[b];
        // arr[b]=arr[a]-arr[b];
        // arr[a]=arr[a]-arr[b];

        arr[a]=(arr[a]+arr[b])-(arr[b]=arr[a]);
    }

    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    
    
}
