import java.util.Scanner;

public class Q4 {
    
    static int binarySearch(int arr[], int start, int end, int x)
    {
        if (end >= start) {
            int mid = start + (end - start) / 2;
 
            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return binarySearch(arr, start, mid - 1, x);
 
            return binarySearch(arr, mid + 1, end, x);
        }
 
        return -1;
    }
 
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no of books");
        int sz=sc.nextInt();
        
        int arr[] = new int[sz];
        String brr[] = new String[sz];

        for(int i=0;i<sz;i++){
            System.out.println("enter the books Id and Name of Book");
            arr[i]=sc.nextInt();
            brr[i]=sc.nextLine();
        }

        System.out.println("Enter the book id to find");
        int x=sc.nextInt();

        int result = binarySearch(arr, 0, sz - 1, x);

        if (result == -1)
            System.out.println("Book not present");
        else
            System.out.println("Book found at index " + result);
            System.out.println("Book Name is "+brr[result]);
    }
}
