
public class lcmGcd{

    public static void main(String args[]){
       int num1=24;
       int num2=7;

       int div=num1;
       int divi=num2;
       int count=1;


     while(divi%div!=0){
         System.out.println(count++);
         int r=divi%div;
         divi=div;
         div=r;
         
        }
    int gcd=div;
    int lcm=(num1*num2)/gcd;
    System.out.println(lcm);
 
    }

    }