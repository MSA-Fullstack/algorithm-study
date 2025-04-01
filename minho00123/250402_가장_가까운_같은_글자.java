import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            
            if (map.containsKey(letter)) {
                answer[i] = i - map.get(letter);
                map.replace(letter, i);
            } else {
                answer[i] = -1;
                map.put(letter, i);
            }
        }
        
        return answer;
    }
}

