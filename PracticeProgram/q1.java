public class q1{
    public static void main(String[] args) {
        int[] arr = {180,-50,-25,-25};
        String[] d = {"2020-01-01","2020-01-01","2020-01-01 ", "2020-01-31"};

        System.out.println(solution(arr,d));
    }

    static int solution(int[] A, String[] D){
        int[] mon = new int[13];
        int ans = 0;

        for(int i=0;i<D.length;i++){
            ans+=A[i];
            if(A[i]<100) continue;
            String st = D[i];
            int m = Integer.parseInt(st.substring(5,7));
            mon[m]++;            
        }

        int cMon = 0;

        for(int i=1;i<13;i++){
            if(mon[i]<1) cMon++;
        }

        System.out.println(cMon);

        ans = ans - 5*cMon;


        return ans;
    }
}