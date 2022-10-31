import java.util.*;
public class roti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K");
        int k=sc.nextInt();
        System.out.println("Enter A len 1");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }

        int ans = 0;
        int sum = 0;
        int i=0;
        int j=0;
        while(i<n1 || j<n2){
            if(i<n1 && j<n2){
                if(arr1[i]<arr2[j]){
                    sum +=arr1[i];
                    ans++;
                    i++;
                }else{
                    sum += arr2[j];
                    ans++;
                    j++;
                }
            }else if(i<n1){
                sum +=arr1[i];
                ans++;
                i++;
            }else if(j<n2){
                sum+=arr2[j];
                ans++;
                j++;
            }

            if(sum>k){
                ans--;
                break;
            }
            if(sum==k) break;
        }
        System.out.print(ans);
    }
}
