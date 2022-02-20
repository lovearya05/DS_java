public class prime{
    public static void main(String[] args)
    {
        int num=16;
        
        boolean flag=true;

        for(int i=2;i*i<=num;i++)
        {
          if(num%i==0)
           {
               flag=false;
               break;
           }
        }   
           if(flag)
           {
                System.out.println("no is prime");
           }
           else
           {
                 System.out.println("no is not prime");
           }
      
    }
}