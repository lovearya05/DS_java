//                                  steps when max jump=n
public class stairs1{
    public static void main(String[] args)
    {
        int n=3;
        printPath(n,n,"");
        
    }
public static void printPath(int n,int jump,String ans) {
    if(n==0){
        System.out.println(ans);
        return;
    }
    for(int i=1;i<=jump;i++){
        if((n-i)>=0)    
        printPath(n-i,jump,ans+i);

    }
}

}