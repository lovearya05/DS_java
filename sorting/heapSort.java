import java.util.Arrays;

public class heapSort {
    public static void main(String[] args) {
        int[] arr = {5,1,1,2,0,0};

        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void heapSort(int[] arr){
        buildHeap(arr);

        for(int i=arr.length-1;i>0;i--){
            swap(arr,0,i);
            heapify(arr,i,0);
        }
    }
    static void buildHeap(int[] arr){
        int n=arr.length;
        int start = (n/2)-1;

        for(int i=start;i>=0;i--){
            heapify(arr,n,i);
        }
    }
    static void heapify(int[] arr,int n,int ci){
        int large = ci;
        int cl = (ci*2)+1;
        int cr = (ci*2)+2;

        if(cl<n && arr[cl]>arr[large]) large = cl;
        if(cr<n && arr[cr]>arr[large]) large = cr;

        if(large!=ci){
            swap(arr, ci, large);
            heapify(arr, n, large);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
