import java.util.PriorityQueue;

public class kLargestElement {

    public static void main(String[] args) {
        int[] arr = {7,3,7,-8,16,15,8,9,18};

        kLargestElements(arr,3);
    }
    static void kLargestElements(int[] arr,int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            if(pq.size()<k){
                pq.add(arr[i]);
            }else if(pq.poll()<arr[i]){ // poll removes the top element and return
            // }else if(pq.peek()<arr[i]){ 
            //     pq.remove();
                pq.add(arr[i]);
            }
        }

        while(pq.size()>0){
            System.out.print(pq.remove()+" ");
        }


    }
    
    

}


