import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); 
        int n = citations.length;
        for (int h = n; h >= 0; h--) {
            int count = 0; 
            for (int i = n - 1; i >= 0; i--) {
                if (citations[i] >= h) {
                    count++; 
                } else {
                    break;
                }
            }
            if (count >= h) {
               
                return h;
            }
        }
        return 0;
    }
}

