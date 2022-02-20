//                             min no in array using post order

public class minArr{
    public static void main(String[] args){
        int arr[]={18,2,3,9,5};
        int idx=0;
        System.out.print(min(arr,idx));
    }
    public static int min(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int recans=min(arr,idx+1);
        
        if(arr[idx]<recans){
            return arr[idx];
        }
        return recans;
    }
}