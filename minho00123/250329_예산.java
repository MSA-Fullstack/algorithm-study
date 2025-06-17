import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        
        int i = 0;
        int sum = 0;
        while (i < d.length) {
            if (sum + d[i] > budget) {
                break;
            }
            sum += d[i];
            count++;
            i++;
        }
        
        return count;
    }
}

