import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] sarr=s.split(" ");
        int min = Integer.parseInt(sarr[0]);
        int max = Integer.parseInt(sarr[0]);
        for (int i = 1; i < sarr.length; i++) {
            int value = Integer.parseInt(sarr[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        String answer = min+" "+max;
        return answer;
    }
}
