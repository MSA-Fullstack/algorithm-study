import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        int size = 1;
        while (true) {
            if (size == elements.length + 1) {
                break;
            }

            for (int i = 0; i < elements.length; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                   sum += elements[j % elements.length];
                }
                set.add(sum);
            }

            size++;
        }
        
        return set.size();
    }
}

