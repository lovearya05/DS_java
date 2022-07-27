import java.util.ArrayList;
import java.util.LinkedList;
// import java.util.HashMap;
// import java.util.ArrayList;


public class hm {
    static class HashMapU{

        private class pair{
            int val;
            int key;
    
            pair(int key,int val){
                this.key=key;
                this.val = val;
            }
    
        }
        
        private LinkedList<pair>[] bucket;
        private int size; // no of keys
        private int k; // loading factor

        HashMapU(){
            init(4);
        }

        private void init(int sz){
            bucket = new LinkedList[sz];
            size = 0;
            k=2;

            for(int i=0;i<bucket.length;i++){
                bucket[i] = new LinkedList<>();
            }
        }
    
        private int hcode(Integer key){

            int hc=key.hashCode();

            return Math.abs(hc)%bucket.length;
        }

        private void put(int key,int val){

            int hc = hcode(key);

            for(pair pr:bucket[hc]){
                if(pr.key==key){
                    pr.val = val;
                    return;
                }
            }
            pair pr = new pair(key, val);
            bucket[hc].addLast(pr);
            size++;

            double lambda = (size*1.0)/bucket.length;
            if(lambda>k){
                rehashing();
            }

        }

        private void rehashing(){
            LinkedList<pair>[] copy = bucket;
            init(bucket.length*2);

            for(int i=0;i<copy.length;i++){
                for(pair pr:copy[i]){
                    put(pr.key,pr.val); 
                }
            }
        }

        private void remove(int key){
            int hc = hcode(key);

            for(pair pr:bucket[hc]){
                if(pr.key==key){
                    bucket[hc].remove(pr);
                    size--;
                    return;
                }
            }
        }

        private int get(int key){
            int hc = hcode(key);

            for(pair pr:bucket[hc]){
                if(pr.key==key){
                    return pr.val;
                }
            }

            return -1;
        }

        private boolean containsKey(int key){

            int hc = hcode(key);

            for(pair pr:bucket[hc]){
                if(pr.key==key) return  true;
            }

            return false;
        }

        private ArrayList<Integer> keys(){
            ArrayList<Integer> ans = new ArrayList<>();

            for(int i=0;i<bucket.length;i++){
                for(pair pr:bucket[i]){
                    ans.add(pr.key);
                }
            }
            return ans;
        }

        private int size(){
            return size;
        }
    
        private void display(){
            for(int i=0;i<bucket.length;i++){
                System.out.println("-------  "+i+"  -------");
                for(pair pr:bucket[i]){
                    System.out.println(pr.key+" --> "+pr.val);
                }
            }
        }

    }

    public static void main(String[] args) {
        HashMapU hm = new HashMapU();

        hm.put(5, 3);
        hm.put(3, 4);
        hm.put(2, 5);
        hm.put(1,7);

        // hm.display();
        
        hm.remove(5);
        // hm.display();

        System.out.println(hm.get(5));
        System.out.println(hm.containsKey(5));
        System.out.println(hm.containsKey(15));

        System.out.println(hm.keys());
        System.out.println(hm.size());

        
    }
}
