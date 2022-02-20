import java.util.HashMap;

// You are given an integer array nums and an integer k.

// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array. 

public class pairWithKSum {
    public static void main(String[] args) {
        int[] arr={1,5,7,-1,5};

        ans(arr,6);

    }
    static void ans(int[] nums,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();

        int count=0;
        for(int b:nums){
            int a = k-b;
            if(hm.containsKey(a)){
                System.out.print("["+a+","+b+"]"+",");
                count++;
                if(hm.get(a)>1){
                    hm.put(a,hm.get(a)-1);
                }else{
                    hm.remove(a);               
                }
            }else{
                if(hm.containsKey(b)){
                     hm.put(b,hm.get(b)+1);
                }else{
                   hm.put(b,1);                
                }
                
            }
        }
        System.out.println("\nTotal no of pair" +count);
    }
     
}
