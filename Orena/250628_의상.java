import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesCount = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String category = cloth[1]; 
            clothesCount.put(category, clothesCount.getOrDefault(category, 0) + 1);
        }
        
        int answer = 1;
        for (int count : clothesCount.values()) {
            answer *= (count + 1);
        }
        
        return answer - 1;
    }
}
