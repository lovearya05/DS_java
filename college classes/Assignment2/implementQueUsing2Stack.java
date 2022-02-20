import java.util.Arrays;

public class implementQueUsing2Stack {

    static class stack{
        static int[] arr=new int[30];
        static int ptr=0;
        void push(int val){
            if(ptr==arr.length){
                System.out.println("******* --------------Unable to push Overflow");
                return;
            }
            arr[ptr]=val;
            System.out.println("Element is added "+val);
            ptr++;
        }
        int pop(){
            if(ptr==0){
                System.out.println(" ******** --------  Underflow No Element Present");
                return -1;
            }
            return arr[--ptr];

        }
        int size(){
            return ptr;
        }
        int peek(){
            if(ptr==0){
                System.out.println("No Element");
                return -1;
            }
            return arr[ptr-1];
        }
    }

    // static Stack<Integer> st1=new Stack<>();
    // static Stack<Integer> st2=new Stack<>();

        static stack st1=new stack();
        static stack st2=new stack();



    static void insert(int data){
        st1.push(data);
    }

    static int deletion(){
        if(st2.size()==0){
            while(st1.size()!=0){
                st2.push(st1.pop());
            }
        }
        int temp=st2.pop();
        System.out.println("Element deleted "+temp);
        return temp;
    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(40);
        // insert(50);
        
        deletion();
        deletion();
        
        insert(60);
        deletion();
        deletion();
        deletion();
    }
}
