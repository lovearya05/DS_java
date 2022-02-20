import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Map;

public class freq{
    public static void main(String[] args) {

        
        // freq();

        // intersection();

        // int[] arr={15,3,14,2,13,5,8,7,1,12,16,9};
        // findLarCon(arr);

        noOfOccAndIntersection();
    }

    static void noOfOccAndIntersection(){
        int[] arr={1,2,3,4,1,2,3};
        int[] brr={3,2,8,9,4,1,3};

        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        
        for(int i:arr){
            if(hm1.containsKey(i)){
                hm1.put(i, hm1.get(i)+1);
            }else{
                hm1.put(i, 1);
            }
        }
        
        for(int i:brr){
            if(hm2.containsKey(i)){
                hm2.put(i, hm2.get(i)+1);
            }else{
                hm2.put(i, 1);
            }
        }

        HashMap<Integer,Integer> ans=new HashMap<>();
        if(arr.length<brr.length){
            for(int i:arr){
                // System.out.println("----------"+Math.min(hm1.get(i),hm2.get(i)));
                if(hm2.containsKey(i)){
                    ans.put(i, Math.min(hm1.get(i),hm2.get(i)));

                }
            }
        }else{
            for(int i:brr){
                if(hm1.containsKey(i)){

                    ans.put(i, Math.min(hm1.get(i),hm2.get(i)));
                }
            }
        }

        ArrayList<Integer> a=new ArrayList<>(ans.keySet());

        for(int i:a){
            System.out.println(i+"-->"+ans.get(i));
        }

    }
    static void findLarCon(int[] arr){
        HashMap<Integer,Boolean> hm=new HashMap<>();

        //o(N)
        for(int v:arr){ 
            hm.put(v,true);
        }

        //o(N)
        for(int v:arr){
            if(hm.containsKey(v+1)){
                hm.put(v+1,false);
            }
        }

        int gsn=-1;
        int gmlen=1;//global max length

        ArrayList<Integer> keys=new ArrayList<>(hm.keySet());

        //o(N)

        for(int key:keys){
            if(hm.containsKey(key)){
                int lsp=key;
                int lmlen=1;

                while(hm.containsKey(lsp+lmlen)){
                    lmlen++;
                }

                if(lmlen>gmlen){
                    gmlen=lmlen;
                    gsn=lsp;
                }
            }
        }

        System.out.println("Max size of consicutive mumber "+gmlen);

        for(int i=0;i<gmlen;i++){
            System.out.print(gsn+i+"==>");
        }

    }

    static void intersection(){
        int[] arr={1,2,3,4,0};
        int[] brr={1,2,3,4,5,5,6,7,8};

        HashMap<Integer,Integer> hm1=new HashMap<>(); 
        HashMap<Integer,Integer> hm2=new HashMap<>(); 

        for(int i:arr){
            hm1.put(i,i);
        }

        for(int i:brr){
            hm2.put(i,i);
        }

        HashMap<Integer,Integer> ans = new HashMap<>();

        if(arr.length<brr.length){
            for(int i=0;i<arr.length;i++){
                if(hm1.containsKey(arr[i]) && hm2.containsKey(arr[i])){
                    ans.put(arr[i], arr[i]);
                }
            }
        }else{
            for(int i=0;i<brr.length;i++){
                if(hm1.containsKey(brr[i]) && hm2.containsKey(brr[i])){
                    ans.put(brr[i], brr[i]);
                }
            }
        }

        // System.out.println(ans);

        ArrayList<Integer> keys = new ArrayList<>(ans.keySet());
        // System.out.println(keys);
        for(int key:keys){
            System.out.print(key+", ");
            
        }


    }

    static void freq(){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] arr={8,2,1,0,3,6,1};
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        ArrayList<Integer> keys = new ArrayList<>(hm.keySet());
        // System.out.println(keys);
        for(int key:keys){
            System.out.println(key+"==>"+hm.get(key));
            
        }
    }
}