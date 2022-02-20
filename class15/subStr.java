  //                          Sub-Strings in a String

public class subStr{
    public static void main(String[] args){
        String str="abc";
        PrintSub(str,"");
         
    }
    public static void PrintSub(String str,String ans){
        
        if(str.length()==0){
            if(ans.length()==0){
                System.out.println("-");
                return;
            }
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);

        PrintSub(ros, ans);
        PrintSub(ros,ans+ch);
     
    }
}