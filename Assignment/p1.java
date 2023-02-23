
import java.util.*; 
import java.io.*;
public class p1 {
    

public class p1 {

  public static String StringChallenge(String sen) {
    int len = 0;
    String st = "";
    for(String str : sen.split(" ")){
      int temp = len(str);
      if(temp>len){
        len = temp;
    // System.out.print(len+"-");
        st = str.substring(0,len);
    // System.out.println(st);
      }
    }


    return generateAns(st);

  }

  static String generateAns(String str){
    String tkn = "5kv8ap2ce0";
    HashSet<Character> hs = new HashSet<>();
    for(char ch : tkn.toCharArray()) hs.add(ch);

        // System.out.print(hs);
    StringBuilder sb = new StringBuilder();
    for(char ch : str.toCharArray()){
      if(!hs.contains(ch)){
        // System.out.print(ch);
        sb.append(ch);
      }
    }
    

    if(sb.length()==0) return "EMPTY";

    return sb.toString();
  }

  static int len(String str){
    int len = 0;
    for(char ch : str.toCharArray()){
      if((ch>='a' && ch<='z' ) || (ch>='A' && ch<='Z' ) ){
      // System.out.print(ch+"-");        
        len++;
      }else{
        // System.out.println(len);
        return len;
      }
    }
    // System.out.println(len);
    return len;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
  }

}