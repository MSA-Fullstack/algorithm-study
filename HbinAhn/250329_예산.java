import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int dsum = 0;

        for(int i = 0; i < d.length; i++) {
            dsum += d[i];
        }

        if(budget >= dsum) return d.length;

        Arrays.sort(d);
        
        int sum = 0;
        for(int i = 0; i < d.length; i++) {
            sum += d[i];
            if(sum > budget) break;
            answer++;
        }

        return answer;
    }
}

