public class dialpad{
    static String[] keys={"#",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args){
        String type="23";

        kpc(type,"");


    }

    static void kpc(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        int idx=ch-48;

        String press=keys[idx];

        for(int i=0;i<press.length();i++){
            kpc(ros,ans+press.charAt(i));
        }
    }
}