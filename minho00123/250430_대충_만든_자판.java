import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
            String str = keymap[i];
            
            for (int j = 0; j < str.length(); j++) {
                if (!map.containsKey(str.charAt(j))) {
                    map.put(str.charAt(j), j + 1);
                } else {
                    if (map.get(str.charAt(j)) > j + 1) {
                        map.replace(str.charAt(j), j + 1);
                    }
                }
            }
        }
        
        
        
        for (int i = 0; i < targets.length; i++) {
            String str = targets[i];
            int cnt = 0;
            
            for (int j = 0; j < str.length(); j++) {
                if (map.containsKey(str.charAt(j))) {
                    cnt += map.get(str.charAt(j));
                } else {
                    cnt = -1;
                    break;
                }
            }
            
            answer[i] = cnt;
        }
        
        return answer;
    }
}

