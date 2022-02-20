public class stair {
    public static void main(String[] args) {
        int n=4;

        printPath(n,"");

    }

    static void printPath(int n,String ans){

        // if(n<0) return;

        if(n==0){
            System.out.println(ans);
            return;
        }
        // if(n-1>=0) printPath(n-1, ans+"1");
        // if(n-2>=0) printPath(n-2, ans+"2");
        // if(n-3>=0) printPath(n-3, ans+"3");
        
        for(int i=1;i<=n;i++){
            if(n-i>=0) printPath(n-i, ans +i);            
        }
    }
}
