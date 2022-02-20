public class primefact{

    public static void main(String args[]){
       int num=25;
       int i;
      
    for(i=2;i*i<=num;i++){
     while(num%i==0){
         System.out.println(i+"  ");
         num/=i;
        }
    }
    if(num>2){
          System.out.println(num);
 
    }

    }
}