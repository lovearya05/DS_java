import java.util.Stack;

public class implementQueue{
    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();


    static void insert(int data){
        st1.push(data);
    }

    static int deletion(){
        if(st2.size()==0){
            while(st1.size()!=0){
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(40);
        insert(50);
        
        System.out.println(deletion());
        System.out.println(deletion());
        
        insert(60);
        System.out.println(deletion());
        System.out.println(deletion());
        System.out.println(deletion());
        
        
    }

}