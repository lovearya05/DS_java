import java.util.*;
public class avg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int val : arr){
            if(val>max) max = val;
            if(val<min) min = val;
        }
        
        double maxCnt = 0;
        double minCnt = 0;

        for(int val : arr){
            if(val==max) maxCnt++;
            if(val==min) minCnt++;
        }

        double avg = (double)((max*maxCnt + min*minCnt)/(minCnt + maxCnt));

        System.out.println(avg);


    }
}
