import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String type = cloth[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }
        int answer = 1; 
        Iterator<Integer> it = clothesMap.values().iterator();
        while(it.hasNext()) {
            answer *= (it.next().intValue() + 1);
        }
        answer -= 1;
        
        return answer;
    }
}

