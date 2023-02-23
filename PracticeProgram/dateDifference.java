
public class dateDifference{
    public static void main(String[] args) {
        int d1 = 5;
        int m1 = 6;
        int y1 = 2012;

        int d2 = 6;
        int m2 = 8;
        int y2 = 2013;

        int ans = noOfDays(d1, m1, y1, d2, m2, y2);

        System.out.println(ans);
    }
    static int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        int days1 = y1*365+d1;
        
        for(int i=0;i<m1-1;i++){
            days1 +=months[i];
        }
        
        days1 += LeapYears(y1,m1); // is me hum ye count kr rahe hai ki y1 year 
        // tak kitne leap year hai matlab 29 days wale month utnaey hi honge
        
        int days2 = y2*365+d2;
        
        for(int i=0;i<m2-1;i++){
            days2 += months[i];
        }
        
        days2 += LeapYears(y2,m2);
        
        return Math.abs(days2-days1);
        
    }
    
    static int LeapYears(int y, int m){
        int years = y;
        if(m<=2){
            y--;
        }
        // leap years 4 or 400 se dvisible hoti hai but 100 se nahi hoti
        // to 100 wali -us kr di
        return y/4 + y/400 - y/100;
    }
}