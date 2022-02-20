
//                                   Any power of Any No..
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class anypower{
    public static void main(String[] args)throws Exception{
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);
        int n=Integer.parseInt(br.readLine());
        int p=5;
        //int n=2;
        System.out.println(pow(p,n));
    }
    static int pow(int p,int n){
       if(p==0) return 1;

       int ans=pow(p/2,n);

       if(p%2==0){
           return ans*ans;
       }
       return n*ans*ans;

    }
}