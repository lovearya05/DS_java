import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


// clear = new ArrayList<>()  to empty a Priority Queue

public class priorityQueueConst {

    static class PriorityQueue1{

        private ArrayList<Integer> tree;

        PriorityQueue1(){
            tree=new ArrayList<>();
        }

        public int get(){
            return tree.get(0);
        }

        public int size(){
            return tree.size();
        }

        public void add(int val){

            tree.add(val);

            int ci=tree.size()-1;

            upheapify(ci);

        }

        private void upheapify(int ci){

            if(ci==0){
                return;
            }

            int pi=(ci-1)/2;

            if(tree.get(pi)>tree.get(ci)){
                swap(pi,ci);
                upheapify(pi);
            }

        }

        private void swap(int pi,int ci){

            int valPi=tree.get(pi);
            int valCi=tree.get(ci);

            tree.set(pi, valCi);
            tree.set(ci, valPi);

        }

        public void remove(){

            swap(0,tree.size()-1);

            tree.remove(tree.size()-1);

            downheapify(0);

        }

        private void downheapify(int pi){

            int li=2*pi+1;
            int ri=2*pi+2;

            int mini=pi;

            if(li<tree.size() && tree.get(li)<tree.get(mini)){
                mini=li;
            }

            if(ri<tree.size() && tree.get(ri)<tree.get(mini)){
                mini=ri;
            }


            if(mini!=pi){
                swap(mini, pi);
                downheapify(mini);
            }

        }

        public void displayTree(){
            System.out.println(tree);
        }

        public void clear(){
            tree=new ArrayList<>();
        }
    
    }
    
    public static void main(String[] args) {
        
        PriorityQueue1 pq=new PriorityQueue1();

        pq.add(24);
        pq.add(2);
        pq.add(28);
        pq.add(-24);
        // pq.clear();
        pq.add(14);
        pq.add(14);
        // pq.add(-114);
        pq.remove();

        // pq.displayTree();

        // System.out.println(pq.get());
        // System.out.println(pq.size());

        // min
        // max
        // PriorityQueue<Integer> test=new PriorityQueue<>((a,b)->{return b-a;});
        PriorityQueue<Integer> test=new PriorityQueue<>(Collections.reverseOrder());

        // =========> for max PQ <=================
        // Collections.reverseOrder()
        // lambda 
        // hack converted into -ve

        test.add(24);
        test.add(2);
        test.add(28);
        test.add(-24);
        test.add(14);
        test.add(14);
        test.remove();

        System.out.println(test);
        System.out.println(test.poll());

    }
}