import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class HM_imple {
    
    // inner class
    static class HashMapU{

        private class Node{
            int key;
            char val;

            Node(int key,char val){
                this.key=key;
                this.val=val;
            }
        }

        private LinkedList<Node>[] bucket;
        private int size;//totat number of keys
        private int k;//loading factor

        HashMapU(){
          
          init(4);

        }

        private void init(int sz){
            bucket=new LinkedList[sz];
            size=0;
            k=2;
            for(int i=0;i<bucket.length;i++){
                bucket[i]=new LinkedList<>();
            }

        }

        // generate hashcode
        private int hcode(Integer key){

            int hc=key.hashCode();
            // System.out.println("----------"+hc);
            return Math.abs(hc)%bucket.length;

        }

        public void put(int key,char val){
            
            int hc=hcode(key);

            for(Node node:bucket[hc]){
              if(node.key==key){
                node.val=val;
                return;
              }
            }

            Node newnode=new Node(key,val);
            bucket[hc].addLast(newnode);
            size++;

            double lamda=(size*1.0)/bucket.length;
            if(lamda>k){
                rehashing();
            }

        }

        private void rehashing(){

            LinkedList<Node>[] copyBucket=bucket;
            init(bucket.length*2);


            for(int i=0;i<copyBucket.length;i++){
                for(Node node:copyBucket[i]){
                    put(node.key,node.val);
                }
            }
        }

        public void remove(int key){

            int hc=hcode(key);

            for(Node node:bucket[hc]){
              if(node.key==key){
                bucket[hc].remove(node);
                size--;
                return;
              }
            }

            return;

        }

        public char get(int key){

            int hc=hcode(key);

            for(Node node:bucket[hc]){
              if(node.key==key){
                return node.val;
              }
            }

            return '*';

        }

        public boolean containsKey(int key){

            int hc=hcode(key);

            for(Node node:bucket[hc]){
              if(node.key==key){
                return true;
              }
            }

            return false;

        }
        public ArrayList<Integer> keyS(){
            ArrayList<Integer> arr = new ArrayList<Integer>();

            for(int i=0;i<bucket.length;i++){
                for(Node node:bucket[i]){
                    arr.add(node.key);
                }
            }

            return arr;
        }

        public int size(){
            return size;
        }

        public void display(){

            for(int i=0;i<bucket.length;i++){
                System.out.println("<====="+i+"====>");
                for(Node node:bucket[i]){
                    System.out.println(node.key+"-->"+node.val);
                }
            }
            
        }

    }


    public static void main(String[] args) {
        
        userHm();

        // System.out.println("#####################################");
        // inbuidhm();
    }

    static void inbuidhm(){

        HashMap<Integer,Character> hm=new HashMap();

        hm.put(1, 'A');
        hm.put(2, 'A');
        hm.put(3, 'A');
        hm.put(4, 'A');
        hm.put(5, 'A');
        hm.put(6, 'A');
        hm.put(7, 'A');
        hm.put(8, 'A');

        System.out.println(hm.get(12));
        System.out.println(hm.containsKey(8));
        System.out.println(hm.size());
        hm.remove(12);
        System.out.println(hm.size());

    }

    static void userHm(){
        HashMapU obj=new HashMapU();

        obj.put(1, 'A');
        obj.put(2, 'b');
        obj.put(7, 'c');
        obj.put(2, 'd');
        obj.put(3, '5');
        obj.put(4, '5');
        obj.put(5, '5');
        obj.put(6, '5');
        obj.put(9, '5');
        obj.put(12, 'y');
        System.out.println(obj.get(12));
        System.out.println(obj.containsKey(121));
        System.out.println(obj.size());
        obj.remove(12);
        System.out.println(obj.size());
        obj.display();

        System.out.println("Key set : "+obj.keyS());

        // for(int i:hm.keyS()){
        //     System.out.println("key set"+i);
        // }

    }





}