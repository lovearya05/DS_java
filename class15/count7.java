/*Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops)*/

public class count7{
    public static void main(String[] args)
    {
        int rows=88788;
        System.out.print(sumDigits(rows));
    }
public static int sumDigits(int n) {
    if(n==0) return 0;
    int i=0;
    if(n%10==8) i++;
    i=i+sumDigits(n/10);
    return i;
}

}