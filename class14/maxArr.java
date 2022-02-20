//                                      Max No in array by post order

public class maxArr{
    public static void main(String[] args){
        int arr[]={10,2,3,9,5};
        int idx=0;
        System.out.print(max(arr,idx));
    }
    public static int max(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int recans=max(arr,idx+1);
        
        if(arr[idx]>recans){
            return arr[idx];
        }
        return recans;
    }
}