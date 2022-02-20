
public class noOfChar{
    public static void main(String[] args)
    {
        String str="kdxxfgdx";
        System.out.print(count(str));
    }
public static int count(String str) {
    if(str.length()==0) return 0;
    char str1='x';
    int i=count(str.substring(1));
    if(str.charAt(0)==str1) return i+1;
    return i;
}

}