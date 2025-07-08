import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        Map<String, Integer> cache = new LinkedHashMap<>(cacheSize, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > cacheSize;
            }
        };

        int totalTime = 0;

        for (String city : cities) {
            String lowerCity = city.toLowerCase();
            
            if (cache.containsKey(lowerCity)) {
                totalTime += 1;
            } 
            else {
                totalTime += 5; 
            }

            cache.put(lowerCity, 1);
        }

        return totalTime;
    }
}
