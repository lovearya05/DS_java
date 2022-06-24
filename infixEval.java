import java.util.Stack;

public class infixEval{
  public static void main(String[] args) {
    String exp = "(5+(2*((6*2)+3)))";
    // int ans = infixEval(exp);    
    // System.out.println(ans);
    System.out.println(postFixEval("5262*3+++"));
  }
  static int infixEval(String exp){
    Stack<Integer> opr = new Stack<>();
    Stack<Character> oper = new Stack<>();

    for(char ch:exp.toCharArray()){
      if(ch=='('){
        oper.push(ch);
      }else if(ch==')'){
        while(oper.peek()!='('){
          int val2=opr.pop();
          int val1=opr.pop();
          int res = operation(val1,val2,oper.pop());
          opr.push(res);
        }
        oper.pop();
      }else if(ch>='0' && ch<='9'){
        opr.push(ch-'0');
      }else{
        while(oper.size()>0 && precedence(ch)<precedence(oper.peek())){
          int val2 = opr.pop();
          int val1 = opr.pop();
          int res = operation(val1,val2,oper.pop());
          opr.push(res);
        }
        oper.push(ch);
      }
    }

    return opr.peek();
  }
  static int operation(int val1,int val2,char op){
    if(op=='+') return val1+val2;
    if(op=='-') return val1-val2;
    if(op=='*') return val1*val2;
    return val1+val2;
  }
  static int precedence(char ch){
    if(ch=='(' || ch==')') return 0;
    if(ch=='*' || ch=='/') return 2;
    return 1;
  }
  static int postFixEval(String str){
    Stack<Integer> st = new Stack<>();
    for(char ch:str.toCharArray()){
      if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
        if(st.size()>1){
          int val2 = st.pop();
          int val1 = st.pop();
          int res = operation(val1, val2, ch);
          st.push(res);
        }
      }else{
        st.push(ch-'0');
      }
    }
    return st.peek();
  }


}