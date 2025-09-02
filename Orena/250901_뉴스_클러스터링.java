import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = toMap(str1);
        Map<String, Integer> map2 = toMap(str2);
        
        if(map1.isEmpty() && map2.isEmpty()){
            return 65536;
        }
        
        int intersection = 0;
        int sumA = 0;
        int sumB = 0;
        
        for(int a : map1.values()) sumA += a;
        for(int b : map2.values()) sumB += b;
        
        for(String key: map1.keySet()) {
            if(map2.containsKey(key)) {
                intersection += Math.min(map1.get(key), map2.get(key));
            }
        }
        
        int union = sumA + sumB - intersection;
        
        double jaccard = (double) intersection / union;
        
        int answer = (int) Math.floor(jaccard * 65536);
        return answer;
    }
    
    public static Map<String, Integer> toMap(String str) {
        Map<String, Integer> map = new HashMap<>();
        String upper = str.toUpperCase();
        
        for(int i=0; i<upper.length() -1; i++){
            char cha1 = upper.charAt(i);
            char cha2 = upper.charAt(i+1);
            
            if ((cha1 >= 'A' && cha1 <='Z') && (cha2 >= 'A' && cha2 <= 'Z')) {
                String result = "" + cha1 + cha2;
                map.put(result, map.getOrDefault(result, 0) +1);
            }
        }
        
        return map;
    }
}
