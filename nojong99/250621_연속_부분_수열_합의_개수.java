import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length; 
        Set<Integer> Sums = new HashSet<>();
         
        int[] extendedElements = new int[2 * n];
        for (int i = 0; i < n; i++) {
            extendedElements[i] = elements[i];
            extendedElements[i + n] = elements[i];  
        }
        
         
        for (int l = 1; l <= n; l++) {
             
            for (int j = 0; j < n; j++) {
                int currentSum = 0;
                 
                for (int k = 0; k < l; k++) {
                    currentSum += extendedElements[j + k];
                }
                 
                Sums.add(currentSum);
            }
        }
         
        return Sums.size();
    }
}

