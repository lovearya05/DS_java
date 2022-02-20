//                  N bunnies having 2 ears
public class bunnies{
    public static void main(String[] args)
    {
       int bunnies=2;
       System.out.print(bunnyEars(bunnies));
    }  
    public static int bunnyEars(int bunnies) {
        if(bunnies==0) return 0;
        int a=0;
        a+=bunnyEars(bunnies-1);
        return a+2;
    }
}