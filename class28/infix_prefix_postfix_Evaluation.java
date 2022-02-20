import java.util.Stack;
public class infix_prefix_postfix_Evaluation {
    static int infixEval(String exp){
        Stack<Integer> oper=new Stack<>();
        Stack<Character> opera=new Stack<>();

        for(char ch :exp.toCharArray()){
        //    ch=='*' || ch=='/' || ch=='+' || ch=='-'
            if(ch=='(' ){
                opera.push(ch);
            }else if(ch==')'){

                while(opera.peek()!='('){
                     int val2=oper.pop();
                     int val1=oper.pop();
                     int res=operation(val1, val2, opera.pop());
                     oper.push(res);
                }

                opera.pop();
            }
            else if(ch>='0' && ch<='9'){
                oper.push(ch-'0');
            }else{

                while(opera.size()>0 &&
                 precedence(ch)<precedence(opera.peek())){
                     int val2=oper.pop();
                     int val1=oper.pop();
                     int res=operation(val1, val2, opera.pop());
                     oper.push(res);
                }
                    
                opera.push(ch);

            }
        }

        while(opera.size()!=0){
            int val2=oper.pop();
            int val1=oper.pop();
            int res=operation(val1, val2, opera.pop());
            oper.push(res);
                     
        }



        return oper.pop();

    }
    static int precedence(char op){
        if(op=='(' || op==')') return 0;
        if(op=='*' || op=='/') return 2;
        return 1;
    }
    static int operation(int val1,int val2,char op){

        if(op=='+'){
            return val1+val2;
        }else if(op=='-'){
            return val1-val2;
            
        }else if(op=='*'){
            return val1*val2;
            
        }else{
            return val1/val2;
        }

    }
    static String infixToPre(String exp){

        Stack<String> oper=new Stack<>();
        Stack<Character> opera=new Stack<>();

        for(char ch :exp.toCharArray()){
            if(ch=='(' ){
                opera.push(ch);
            }else if(ch==')'){

                while(opera.peek()!='('){
                    String val2=oper.pop();
                     String val1=oper.pop();
                     String res= opera.pop()+val1+val2;
                     oper.push(res);
                }

                opera.pop();
            }
            else if(ch>='0' && ch<='9'){
                oper.push(""+ch);
            }else{

                while(opera.size()>0 &&
                 precedence(ch)<precedence(opera.peek())){
                    String val2=oper.pop();
                    String val1=oper.pop();
                    String res= opera.pop()+val1+val2;
                    oper.push(res);
                }
                    
                opera.push(ch);

            }
        

        }

        while(opera.size()!=0){
            String val2=oper.pop();
            String val1=oper.pop();
            String res= opera.pop()+val1+val2;
            oper.push(res);      
        }



        return oper.pop();

    }
    static String infixToPost(String exp){

        Stack<String> oper=new Stack<>();
        Stack<Character> opera=new Stack<>();

        for(char ch :exp.toCharArray()){
            if(ch=='(' ){
                opera.push(ch);
            }else if(ch==')'){

                while(opera.peek()!='('){
                    String val2=oper.pop();
                     String val1=oper.pop();
                     String res= val1+val2+opera.pop();
                     oper.push(res);
                }

                opera.pop();
            }
            else if(ch>='0' && ch<='9'){
                oper.push(""+ch);
            }else{

                while(opera.size()>0 &&
                 precedence(ch)<precedence(opera.peek())){
                    String val2=oper.pop();
                    String val1=oper.pop();
                    String res= val1+val2+opera.pop();
                    oper.push(res);
                }
                    
                opera.push(ch);

            }
        

        }

        while(opera.size()!=0){
            String val2=oper.pop();
            String val1=oper.pop();
            String res= val1+val2+opera.pop();
            oper.push(res);      
        }



        return oper.pop();

    }
    static String prefixToInfix(String exp){
        Stack<String> oper=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(ch>='0' && ch<='9'){
                oper.push(String.valueOf(ch-'0'));
            }else{
                String val2=oper.pop();
                String val1=oper.pop();
                // int res=operation(val1, val2, ch);
                oper.push("("+val2+ch+val1+")");

            }
        }
        return oper.pop();
    }
    static String prefixToPostfix(String exp){
        Stack<String> oper=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(ch>='0' && ch<='9'){
                oper.push(String.valueOf(ch-'0'));
            }else{
                String val2=oper.pop();
                String val1=oper.pop();
                // int res=operation(val1, val2, ch);
                oper.push(val2+val1+ch);

            }
        }
        return oper.pop();
    }
    static String PostFixToInfix(String exp){
        Stack<String> oper=new Stack<>();
        for(char ch:exp.toCharArray()){
            if(ch>='0' && ch<='9'){
                oper.push(""+ch);
            }else{
                String val2=oper.pop();
                String val1=oper.pop();
                oper.push('('+val1+ch+val2+')');
            }
        }
        return oper.pop();
    }
    static String PostFixToPrefix(String exp){
        Stack<String> oper=new Stack<>();
        for(char ch:exp.toCharArray()){
            if(ch>='0' && ch<='9'){
                oper.push(""+ch);
            }else{
                String val2=oper.pop();
                String val1=oper.pop();
                oper.push(ch+val1+val2);
            }
        }
        return oper.pop();
    }
    static int prefixEval(String exp){
        Stack<Integer> oper=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if((ch=='+' || ch=='-' || ch=='*' || ch=='/') && oper.size()>1){
                int val2=oper.pop();
                int val1=oper.pop();
                int res=operation(val1, val2,ch);
                oper.push(res);
            }else{
                oper.push(ch-'0');
            }
        }
        return (int)oper.pop();

    }
    static int postFixEval(String exp){
        Stack<Integer> oper=new Stack<>();
        for(char ch:exp.toCharArray()){
            if((ch=='+' || ch=='-' || ch=='*' || ch=='/') && oper.size()>1){
                int val2=oper.pop();
                int val1=oper.pop();
                int res=operation(val1, val2,ch);
                oper.push(res);
            }else{
                oper.push(ch-'0');
            }
        }
        return oper.pop();

    }

    public static void main(String[] args){
        String exp="(5+2+(6*2)+3)";
        // System.out.println(infixEval(exp));

        String prefix=infixToPre(exp);
        System.out.println(prefix);
        // System.out.println(prefixToInfix(prefix));
        // System.out.println(prefixToPostfix(prefix));
    //     String postfix = infixToPost(exp);
    //     System.out.println(postfix);
    //     System.out.println(PostFixToInfix(postfix));
    //     System.out.println(PostFixToPrefix(postfix));
    //     System.out.println(prefixEval(prefix));
    //     System.out.println(postFixEval(postfix));
    // }
    
}
