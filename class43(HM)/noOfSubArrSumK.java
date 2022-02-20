import java.util.HashMap;

public class noOfSubArrSumK {
    public static void main(String[] args) {
        int[] arr={10,2,-2,-20,10};
        result(arr,-10);

    }
    static void result(int[] arr,int tar){
        int count=0;
        int cus=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:arr){
            cus+=i;
            if(cus==tar){
                count++;
            }
            if(hm.containsKey(cus-tar)){
                count+=hm.get(cus-tar);
            }
            if(hm.containsKey(cus)){
                hm.put(cus, hm.get(cus)+1);
            }else{
                hm.put(cus, 1);
            }
        }
        System.out.println(count);
    }
    
}
