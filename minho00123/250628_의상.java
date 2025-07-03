import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            
            if (map.containsKey(key)) {
                int val = map.get(clothes[i][1]);
                map.replace(key, ++val);
            } else {
                map.put(key, 1);
            }
        }
        
        List<Integer> values = new ArrayList<>();
        map.forEach((key, val) -> {
            values.add(val);
        });

        for (int i = 0; i < values.size(); i++) {
            answer *= values.get(i) + 1;
        }

        return answer - 1;
    }
}

