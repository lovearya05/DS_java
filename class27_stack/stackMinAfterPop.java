package class27_stack;
import java.util.Stack;
import java.util.Arrays;
public class stackMinAfterPop {
    static Stack<Integer> st=new Stack<>();
    static int min;
    static void stackPush(int num){
        if(st.size()==0){
            st.push(num);
            min=num;
        }
        if(num<min){
            st.push(2*num-min);
            min=num;
        }else{
            st.push(num);
        }
    }
    static void stackpop(){
        if(st.peek()<min){
            min=2*min-st.peek();
        }
        st.pop();
    
    }   
    public static void main(String[] args){
        // int[] arr={9,8,4,3,7,5,2,6,1};
        stackPush(9);
        stackPush(8);
        stackPush(4);
        // stackPush(3);
        stackPush(7);
        stackPush(5);
        stackPush(2);
        stackPush(6);
        stackPush(1);
        stackpop();
        stackpop();
        stackpop();
        stackpop();
        stackpop();
        System.out.println(min);

    }
}
