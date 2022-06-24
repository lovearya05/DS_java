public class fibbonacci{
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        System.out.println(fib(dp,n));
    }
    static int fib(int[] dp,int n){
        if(n<=1) return n;

        if(dp[n]!=0) return dp[n];

        dp[n] = fib(dp,n-1)+fib(dp,n-2);
        return dp[n];
    }
}