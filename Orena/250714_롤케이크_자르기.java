import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int n = topping.length;
        
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        
        for(int t:topping) {
            right.put(t, right.getOrDefault(t, 0) +1);
        }
        
        for(int i=0; i<n-1; i++){
            int current = topping[i];
            left.put(current, left.getOrDefault(current, 0) +1);
            right.put(current, right.get(current) -1);
            if(right.get(current) == 0){
                right.remove(current);
            }
            if(left.size() == right.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}
