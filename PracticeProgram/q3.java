public class q3 {
    public static void main(String[] args) {
        String str = "aa?b??a";

        solution(str,0,"");
    }
    static void solution(String str, int idx,String ans){
        if(idx==str.length()){
            // ans = str;
            System.out.println(ans);
            return;
        }

        

        if(idx>=2 && str.charAt(idx)=='?'){
            if(idx<str.length()-1-2){
                if(str.charAt(idx+1)!='a'  || str.charAt(idx+2)!='a'){
                    solution(str, idx+1, ans + 'a');
                }
    
                if(str.charAt(idx+1)!='b'  || str.charAt(idx+2)!='b'){
                    solution(str, idx+1, ans + 'b');
                }
                
            }else
            if(str.charAt(idx-1)!='a'  || str.charAt(idx-2)!='a'){
                solution(str, idx+1, ans + 'a');
            }

            if(str.charAt(idx-1)!='b'  || str.charAt(idx-2)!='b'){
                solution(str, idx+1, ans + 'b');
            }
        }else{
            if(idx<=1 && str.charAt(idx)=='?'){
                solution(str, idx+1, ans + 'a');

                solution(str, idx+1, ans + 'b');
            }else{
                solution(str, idx+1, ans + str.charAt(idx));
            }
        }
    }
}
