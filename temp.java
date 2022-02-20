public class temp{
    public static void main(String argsfklsadjfklsadj[]) {
        int[] arr = {4,0,3,2,1};
        int[] ans = new int[arr.length];

        inversePlace(arr,ans);
        display(ans);

    }

    static void inversePlace(int[] arr,int[] ans){
        for(int i=0;i<arr.length;i++){
            // int temp = arr[i];
            // ans[temp] = i;
            ans[arr[i]] = i;
        }
    }

    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}