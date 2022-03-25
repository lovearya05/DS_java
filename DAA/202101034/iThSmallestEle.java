public class iThSmallestEle {

    class minHeap{

        int[] heap;
        int capacity;
        int heapSize;
        int parent(int p){
            return ((p-1)/2);
        }
        int left(int l){
            return ((2*l)+1);
        }
        int right(int r){
            return ((2*r)+2);
        }
        
        
        // constructer of minheap class
        minHeap(int[] arr,int size){
            heapSize = size;
            heap = arr;
            int i = (heapSize-1)/2;
            
            while(i>=0){
                minHeapify(i);
                i--;
            }
            
        }
        
        void replace(int val){
            this.heap[0] = val;
            minHeapify(0);
        }
        
        int peek(){
            return heap[0];
        }



        void minHeapify(int ci){
            int lc = left(ci);
            int rc = right(ci);

            int small =ci;

            if(lc<heapSize && heap[lc]<heap[ci]) small = lc;
            if(rc<heapSize && heap[rc]<heap[small]) small = rc;

            if(small!=ci){
                int temp = heap[ci];
                heap[ci] = heap[small];
                heap[small] = temp;
                minHeapify(small);
            }

        }

        int pop(){
            if(heapSize==0) return -1;

            int root = heap[0];

            if(heapSize>1){
                heap[0] = heap[heapSize-1];
                minHeapify(0);
            }
            heapSize--;
            return root;
        }

        
    };



    int kthSmallest(int[] arr,int n,int k){

        minHeap mh = new minHeap(arr,n);

        for(int i=0;i<k-1;i++){
            mh.pop();
        }
        return mh.peek();

    }


    public static void main(String[] args) {
        int arr[] = {1,4,7,3,2,8,6,7};
        int n = arr.length, k=2;
        iThSmallestEle ismall = new iThSmallestEle();
        System.out.println("2nd smallest element is : ");
        System.out.println(ismall.kthSmallest(arr,n,k));
    }

};
