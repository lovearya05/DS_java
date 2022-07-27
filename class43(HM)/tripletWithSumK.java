import java.util.HashMap;

public class tripletWithSumK {
    public static void main(String[] args) {
        int[] arr={12,3,4,1,6,9};
        find(arr,24);
    }
    static void find(int[] arr,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();

        //target = hv+a[i]+a[j]
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int hv= k-arr[i]-arr[j];
                if(hm.containsKey(hv)){
                    System.out.println(arr[i]+", "+arr[j]+", "+hv);
                    break;
                }
                hm.put(arr[j], arr[j]);
            }
        }
    }
}



