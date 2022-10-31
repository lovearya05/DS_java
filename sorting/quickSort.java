import java.util.Arrays;
public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,8,6,3,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int arr[], int low, int high)
    {
        if(low>=high) return;
        int pi = partition(arr,low,high);
        
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        int i=low, pivot = arr[high];
        int j = low;
        while(i<=high){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr,i,j);
                j++;i++;
            }
        }
        return j-1;
    }
    static void swap(int[] arr,int i,int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
