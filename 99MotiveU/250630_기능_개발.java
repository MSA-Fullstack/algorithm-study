import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();

        int n = progresses.length;
        int[] days = new int[n];

        for (int i = 0; i < n; i++) {
            int remain = 100 - progresses[i];
            days[i] = (int) Math.ceil((double) remain / speeds[i]);
        }

        int count = 1;
        int maxDay = days[0];

        for (int i = 1; i < n; i++) {
            if (days[i] <= maxDay) {
                count++;
            } else {
                result.add(count);
                count = 1;
                maxDay = days[i];
            }
        }
        
        result.add(count);
        answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
