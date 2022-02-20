import java.util.Scanner;
public class bookid{

    static class hash{
        int id;
        String name;
    }
    public static void main(String[] args) {
        System.out.println("Enter the no of books wants to enter");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        hash[] obj=new hash[n];

        for(int i=0;i<n;i++){
            obj[i]=new hash();
            System.out.print("Enter the book id : ");
            obj[i].id=sc.nextInt();
            System.out.println();
            System.out.print("Enter the book name : ");
            obj[i].name=sc.next();
            System.out.println();
        }
        
        obj=bubbleSort(obj);

        display(obj);
    }

    static void display(hash[] obj){
        for(int i=0;i<obj.length;i++){
            System.out.println("Book id is : "+obj[i].id);
            System.out.println("Book name is : "+obj[i].name);
        }
    }

    static hash[] bubbleSort(hash[] obj){
        
        for(int i=0;i<obj.length-1;i++){
            for(int j=0;j<obj.length-i-1;j++){
                if(obj[j].id>obj[j+1].id){
                    hash temp=obj[j];
                    obj[j]=obj[j+1];
                    obj[j+1]=temp;
                }
            }
        }

        return obj;
    }
    
}
