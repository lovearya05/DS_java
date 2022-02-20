// N bunnies 1,2,3... bunnies have 2 ears & 2,4,6.. bunnies have 3 ears total ears ?
public class bunnies1{
    public static void main(String[] args)
    {
       int bunnies=2;
       System.out.print(bunnyEars(bunnies));
    }  
    public static int bunnyEars(int bunnies) {
        if(bunnies==0) return 0;
        int a=0;
        a+=bunnyEars(bunnies-1);
        if(bunnies%2==0){
            return a+3;
        }else return a+2;
    }
}