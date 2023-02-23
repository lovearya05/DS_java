import java.util.*;
public class mail {
    public static void main(String[] args) {
        String[] arr = {"ghi@hotmail.com", "def@yahoo.com","ghi@gmail.com", "abc@channelier.com", "abc@hotmail.com", "def@hotmail.com", "abc@gmail.com", "abc@yahoo.com", "def@channelier.com","jkl@hotmail.com", "ghi@yahoo.com", "def@gmail.com"};
        HashSet<String> hm = new HashSet<>();

        Arrays.sort(arr);

        for(String st:arr){
            String host = returnHost(st);
            
            if(!hm.contains(host)){
                hm.add(host);
                System.out.println(st);
            }
        }

    }

    static String returnHost(String st){
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='@'){
                return st.substring(i);
            }
        }
        return "-1";
    }
}
