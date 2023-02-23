import java.util.*;

public class que {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> od = new ArrayList<>();
        ArrayList<Integer> ev = new ArrayList<>();

        for(int val: arr){
            if(val%2==0){
                ev.add(val);
            }else{
                od.add(val);
            }
        }

        Collections.sort(od);
        Collections.sort(ev);

        int i=0;
        int a=0;
        int b=0;

        int[] brr = new int[n];

        while(i<n){
            brr[i++] = od.get(a++);
            brr[i++] = ev.get(b++);
        }

        
    }
}
