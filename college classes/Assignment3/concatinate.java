import java.util.*;
public class concatinate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String a=sc.nextLine();
        System.out.print("Enter the String 2 : ");
        String b=sc.nextLine();
        String ans="";
        int len1 = length(a);
        int len2 = length(b);
        for(int i=0;i<len1;i++){
            ans+=a.charAt(i);
        }
        for(int i=0;i<len2;i++){
            ans+=b.charAt(i);
        }
        System.out.println(ans);
    }
    static int length(String str){
        char[] arrstr=str.toCharArray();
        int i=0;
        for(char ch:arrstr){
            i++;
        }
        return i;
    }
    
}
