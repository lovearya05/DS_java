import java.util.*;
public class quickSort {
    public static void main(String[] args) {
        // int[] arr={45,7,3,7,2,7,2,6,8,3};
        int[] arr={3,4,43,34,4,4,34};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr,int low,int high){
        if(low>=high) return;

        int pi = partition(arr,low,high);
        System.out.println(pi);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }

    static int partition(int[] arr,int low,int high){
        
        int i=low;
        int j=low;
        int pivot = arr[high];

        while(i<=high){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }

        return j-1;
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
