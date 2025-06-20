import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer> counts = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                int value = map.get(tangerine[i]) + 1;
                map.replace(tangerine[i], value);
            } else {
                map.put(tangerine[i], 1);
            }
        }
        
        for (int val : map.values()) {
            counts.add(val);
        }
        
        counts.sort(Comparator.reverseOrder());
        
        for (int i = 0; i < counts.size(); i++) {
            int count = counts.get(i);

            answer++;
            
            k -= count;
            
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}

