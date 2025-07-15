import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int len = topping.length;
        int[] left = new int[len];
        int[] right = new int[len];
        
        Set<Integer> leftSet = new HashSet<>();
        for (int i = 0 ; i < len; i++) {
            leftSet.add(topping[i]);
            left[i] = leftSet.size();
        }
        
        Set<Integer> rightSet = new HashSet<>();
        for (int i = len - 1; i >= 0; i--) {
            rightSet.add(topping[i]);
            right[i] = rightSet.size();
        }
        
        for (int i = 0; i < len - 1; i++) {
            if (left[i] == right[i + 1]) {
                answer++;
            }
        }
        
        return answer;
    }
}

