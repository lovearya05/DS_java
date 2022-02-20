import java.util.*;
public class lovepreet_202101034 {
    static class hospital {
        String name;
        int beds;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of hospital");
        int n=sc.nextInt();

        hospital[] obj=new hospital[n];
        for(int i=0;i<n;i++){
            obj[i]=new hospital();
            System.out.println("Enter hospital name ");
            obj[i].name=sc.next();
            System.out.println("Enter hospital beds availabl");
            obj[i].beds=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(obj[j+1].beds>obj[j].beds){
                    hospital temp=obj[j+1];
                    obj[j+1]=obj[j];
                    obj[j]=temp;
                }
            }
        }

        System.out.println("Hospital name \t\t beds available");
        for(int i=0;i<n;i++){
            System.out.println(obj[i].name+"\t\t\t"+obj[i].beds);
        }
    }
    
}
