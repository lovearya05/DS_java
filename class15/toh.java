  //                  index from back side

public class toh{
    public static void main(String[] args){
     int n=3;
     char sr='s';
     char hp='h';
     char dt='d';
     
     tohsolve(n,sr,hp,dt);
    }
    public static void tohsolve(int n,char sr,char hp,char dt){
        
        if(n==0) return;
        
       tohsolve(n-1,sr,dt,hp);
       System.out.println(n+"--"+sr+"=>"+dt);
       tohsolve(n-1,hp,sr,dt);
    }
}