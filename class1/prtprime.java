public class prtprime{
    public static void main(String[] args)
    {
        int num=50;
        int temp=0;
        for(int n=2;n<=num;n++)
        {    
          boolean flag=true;
           for(int i=2;i*i<=n;i++)
           {
              if(n%i==0)
               {
               // temp=n;
               flag=false;
                 break;
               }
            }
         if(flag)
         {
          System.out.println(n);
         }
        
        }
      
    }
}