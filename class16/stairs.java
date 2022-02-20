//                                  steps when max jump=3
public class stairs{
    public static void main(String[] args)
    {
        int n=3;
        printPath(n,"");
    }
public static void printPath(int n,String ans) {
    //pro active approach
    //if(n<0) return;
    if(n==0){
        System.out.println(ans);
        return;
    }
    //re-active approach
    if((n-1)>=0)
    printPath(n-1,ans+1);
    if((n-2)>=0)
    printPath(n-2,ans+2);
    if(n-3>=0)
    printPath(n-3,ans+3);
}

}