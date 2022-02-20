import java.util.Arrays;

public class quickSort {
    static int[] arr={2,4,6,5,2,9,5,1};
    public static void main(String[] args) {
        
        quickSrt(0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void quickSrt(int lo,int hi){
        if(lo>=hi) return;

        int pivot = arr[hi];
        int pi = partition(pivot,lo,hi);
        quickSrt(lo, pi-1);
        quickSrt(pi+1, hi);
    }
    static int partition(int pivot, int lo,int hi){
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(i,j);
                i++;
                j++;
            }
        }
        return j;

    }
    static void swap(int lo,int hi){
        int temp=arr[lo];
        arr[lo]=arr[hi];
        arr[hi]=temp;
    }
}
