public class quickSort {
    public static void main(String[] args) {
        int[] arr = {2,4,2,1,7,4,9,3};

        quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }

    static void quickSort(int[] arr,int st,int ed){
        if(st<ed){

            int pt = partition(arr,st, ed);
            quickSort(arr, st, pt-1);
            quickSort(arr, pt+1,ed);
        }
    }

    static int partition(int[] arr,int st,int ed){
        int pivot = arr[ed];

        int idx=st-1;
        for(int i=st;i<=ed-1;i++){
            if(arr[i]<pivot){
                idx++;
                swap(arr,i,idx);
            }
        }
        swap(arr,idx+1,ed);
        
        return idx+1;
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
