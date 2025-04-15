import java.util.Comparator;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings,(a,b)-> {
            if(a.charAt(n)!= b.charAt(n)){
                return a.charAt(n)-b.charAt(n);
            }else{
                return a.compareTo(b);
            }
        });
        answer = strings;
        return answer;
    }
}

