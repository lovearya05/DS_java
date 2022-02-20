import java.util.Arrays;

public class implement_stackUsingArr {

    static class stack{
        static int[] arr=new int[3];
        static int ptr=0;
        void push(int val){
            if(ptr==arr.length){
                System.out.println("******* --------------Unable to push Overflow");
                return;
            }
            arr[ptr]=val;
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

    public static void main(String[] args) {
        stack st=new stack();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        // st.pop();
        // st.size();
        System.out.println(st.peek());
        // System.out.println(st.size());
        // System.out.println(Arrays.toString(st.arr));

    }
}
