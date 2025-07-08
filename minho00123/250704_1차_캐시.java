import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Deque<String> cache = new ArrayDeque<>();
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            if (cache.contains(city)) {
                cache.removeFirstOccurrence(city);
                cache.offerLast(city);
                answer++;
            } else {
                if (cache.size() == cacheSize) {
                    cache.pollFirst();
                    cache.offerLast(city);
                } else {
                    cache.offerLast(city);
                }
                
                answer += 5;
            }
        }
        
        return answer;
    }
}

