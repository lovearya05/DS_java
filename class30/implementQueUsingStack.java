// package class30;

import java.util.Stack;

public class implementQueUsingStack {
    static class queue<E>{
        //push efficient queue using stack

        Stack<E> st1 = new Stack<>();
        Stack<E> st2 = new Stack<>();
        
        void push(E val){
            st1.push(val);
        }
        E pop(){
            if(st2.size()>0){
                return st2.pop();
            }else{
                while(st1.size()>0){
                    st2.push(st1.pop());
                }
            }
            if(st2.empty()) return null;
            return st2.pop();
        }

    }
    public static void main(String[] args) {
        queue<Integer> qq = new queue<>();
        qq.push(1);
        System.out.println(qq.pop());
        System.out.println(qq.pop());
        qq.push(2);
        qq.push(3);
        qq.push(4);
        System.out.println(qq.pop());
    }
}
