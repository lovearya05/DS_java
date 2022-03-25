import java.util.ArrayList;

public class temp{
  public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> brr = new ArrayList<>();

    arr.add(1);
    arr.add(2);
    arr.add(3);
    // arr.add(4);

    while(arr.size()!=1){
      int ans = arr.remove(0)+arr.remove(0);
      arr.add(ans);
      brr.add(ans);
    }

    int sum =0;
    for(int i:brr){
        sum+=i;
    }

    System.out.println(sum);
  
  }
}