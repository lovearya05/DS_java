public class pattern1{
    public static void main(String[] args){
        int n=7;

        for(int i=0;i<n;i++){
            int var=1;
            for(int j=0;j<=i;j++){
                System.out.print(var+" ");
                var=(var*(i-j)/(j+1));
            
            }
            System.out.println();
        }
    }
}