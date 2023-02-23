import java.util.ArrayList;

public class dummy {
    public static void main(String[] args) {
        // print N prime No's
        // printNPrime_No(10);
        // printDigitsOfANo(0);
        // printDigitsFromFrontOfNumber(1345);
        // reverseANumber(1234);
        // inversePlaces(2315647);
        // fibbonacci(18);
        // numberLenght(464);
        // primefactorOfANumber(18);
        // lcmUsingGcd(24,7);
        // diamondPattern(7);
        // pascal(7);
        // decimalToAnybase(21,2);

        // Patterns 
        // pattern1(7);
        // pattern2(7);
        // pattern3(7);
        // pattern4(7);
        // pattern5(7);
        // pattern6(7);
        // pattern7(7);
        // pattern8(7);
        // pattern9(5);
        // pattern10(5);
        // pattern11(5);
        // pattern12(5);
        // pattern13(7);
        // ratMaze();
        // String str = "abc";
        // ArrayList<String> ans = getSubsq(str);
        // System.out.println(ans);
        // System.out.println(ans.size());

        // N Bunnies havaing n ears

        // int ans = FindEars(4);
        // System.out.println(ans);

        // n bunnies with n ears
        // int ans = nBunnies_n_Ears(2);
        // System.out.println(ans);


        // count no of 7

        // int n = 7176287;
        // int ans = countSeven(n);
        // System.out.println(ans);

        // triangle problem
        // int ans = findNoOfTriangle(2);
        // System.out.println(ans);

        // String type = "233";
        // kpc(type, "");

        // mazePath();
        
    }

    static void mazePath(){
        int sr = 0;
        int sc = 0;

        int dr = 2;
        int dc = 2;

        findPath(sr,sc,dr,dc,"");
    }
    static void findPath(int sr, int sc, int dr, int dc, String ans){
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }

        if(sr+1 <=dr){
            findPath(sr+1, sc, dr, dc, ans+"V ");
        }
        if(sc+1 <=dc){
            findPath(sr, sc+1, dr, dc, ans+"H ");
        }

    }
    static String[] keys = {"#",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    static void kpc(String kpc,String ans){
        if(kpc==""){
            System.out.println(ans);
            return;
        }

        String chars = keys[kpc.charAt(0)-'0'];

        for(int i=0;i<chars.length();i++){
            kpc(kpc.substring(1), ans + chars.charAt(i));
        }

    }

    static int findNoOfTriangle(int n){
        if(n==0) return 0;

        return findNoOfTriangle(n-1) + n;
    }
    static int countSeven(int n){
        if(n==0) return 0;
        int a = countSeven(n/10);
        if(n%10==7) return a+1;
        return a;
    }
    static int nBunnies_n_Ears(int bunnies){
        if(bunnies==0) return 0;

        if(bunnies%2==0) return nBunnies_n_Ears(bunnies-1)+3;
        return nBunnies_n_Ears(bunnies-1) + 2;
    }
    static int FindEars(int bunnies){
        if(bunnies==0) return 0;

        return FindEars(bunnies-1) + 2;
    }
    
    static ArrayList<String> getSubsq(String str){
        if(str.length()==0){
            ArrayList<String> res = new ArrayList<String>();
            res.add("");
            return res;
        }

        ArrayList<String> al = getSubsq(str.substring(1));
        ArrayList<String> res = new ArrayList<>();
        res.addAll(al);
        for(String st : al){
            res.add(str.charAt(0)+st);
        }

        return res;

    }
    static void ratMaze(){
        int[][] arr = {
            {0,1,0,0},
            {0,0,0,1},
            {0,1,0,1},
            {0,0,0,0}
        };

        findRatMaze(arr,0,0,"");
    }
    static void findRatMaze(int[][] arr,int sr,int sc,String ans){
        if(sr==arr.length-1 && sc==arr[0].length-1){
            System.out.println(ans);
            return;
        }

        arr[sr][sc] = 1;
        
        //right
        if(isSafe(arr, sr, sc+1)){
            findRatMaze(arr, sr, sc+1, ans + "R ");
        }

        //down
        if(isSafe(arr, sr+1, sc)){
            findRatMaze(arr, sr+1, sc, ans + "D ");
        }
        
        //left
        if(isSafe(arr, sr, sc-1)){
            findRatMaze(arr, sr, sc-1, ans + "L ");
        }
        
        //up
        if(isSafe(arr, sr-1, sc)){
            findRatMaze(arr, sr-1, sc, ans + "U ");
        }

        arr[sr][sc] = 0;

    }
    static boolean isSafe(int[][]arr, int r,int c){
        if(r<0 || c<0 || r>=arr.length || c>=arr[0].length || arr[r][c]==1) return false;
        return true;
    }

    static void pattern13(int n){
        int str = n/2;
        int spc = 1;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
                System.out.println();
                continue;
            }

            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            System.out.println();

            if(i<(n+1)/2){
                spc+=2;
                str--;
            }else{
                str++;
                spc-=2;
            }
        }
    }
    static void pattern12(int n){
        int val=1;
        int spc = n/2;
        int pat = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            int a = val;
            for(int j=1;j<=pat;j++){
                if(j<(pat+1)/2){
                    System.out.print(a+++" ");
                }else{
                    System.out.print(a--+" ");
                }
            }
            System.out.println();

            if(i<(n+1)/2){
                spc--;
                val++;
                pat+=2;
            }else{
                pat-=2;
                spc++;
                val--;
            }
        }
    }
    static void pattern11(int n){
        int spc = n/2;
        int str = 1;
        // System.out.println("  oooo");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=str;j++){
                System.out.print(j + " ");
            }
            System.out.println();
            if(i<(n+1)/2){
                spc--;
                str+=2;
            }else{
                spc++;
                str-=2;
            }
        }
    }
    static void pattern10(int n){
        int str = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<(n+1)/2){
                str++;
            }else{
                str--;
            }
        }
    }
    static void pattern9(int n){
        int a = 65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)a+" ");
                a++;
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        int cnt = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(cnt++ +" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        int spc = n/2;
        int str = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }

            if(i<(n+1)/2){
                spc--;
                str+=2;
            }else{
                spc++;
                str-=2;
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        int spc = n/2;
        int str = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }

            if(i<(n+1)/2){
                spc--;
                str++;
            }else{
                spc++;
                str--;
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void decimalToAnybase(int num,int b){
        int p = 1;
        int ans = 0;

        while(num!=0){
            int r = num%b;
            num/=b;
            ans +=p*r;
            p*=10;

        }
        System.out.println(ans);
    }
    static void pascal(int n){
        for(int i=0;i<n;i++){
            int var = 1;
            for(int j=0;j<=i;j++){
                System.out.print(var + " ");
                var = var*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    static void diamondPattern(int n){
        int str = n/2;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
                System.out.println();
                continue;
            }
            // top left
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }

            System.out.println();
            if(i>(n-2)/2){
                str--;
            }else{
                str++;
            }
        }
    }

    static void primefactorOfANumber(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n = n/i;
            }
        }
        if(n>2){
            System.out.println(n);
        }
    }
    static void lcmUsingGcd(int div, int divi){
        int n1= div;
        int n2 = divi;
        while(divi%div!=0){
            int rem = divi % div;
            divi = div;
            div = rem;
        }
        int gcd = div;
        int lcm = n1*n2/gcd;
        System.out.println(lcm);
    }
    static void inversePlaces(int n){
        int cnt = 1;
        int ans = 0;
        while(n!=0){
            ans = ans + (int)Math.pow(10,(n%10)-1)*cnt;
            n/=10;
            cnt++;
        }
        System.out.println(ans);
    }
    static void reverseANumber(int n){
        int ans = 0;
        while(n!=0){
            ans =  ans*10 + n%10;
            n/=10;
        }
        System.out.println(ans);
    }
    static void printDigitsFromFrontOfNumber(int n){
        int cnt = numberLenght(n);

        while(n!=0){
            System.out.println((int)(n/Math.pow(10,cnt-1)));
            n %= Math.pow(10, cnt-1);
            cnt--;
        }

    }
    static void printDigitsOfANo(int n){
        if(n==0){
            System.out.println(n);
        }
        while(n!=0){
            System.out.println(n%10);
            n/=10;
        }
    }
    static int numberLenght(int n){
        int cnt = 0;
        while(n!=0){
            cnt++;
            n/=10;
        }
        // System.out.println(cnt);
        return cnt;
    }
    static void fibbonacci(int n){
        int a = 0;
        int b = 1;

        while(a<=n){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }
    }
    static void printNPrime_No(int a){
        
        for(int i=1;i<=a;i++){
            boolean flag = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
