import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.charAt(n) != s2.charAt(n)) {
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }else 
                    return s1.compareTo(s2);
            }
        });
            
        answer = strings;
        
        return answer;
    }
}

