import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] completeDays = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            int day = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                day++;
            }
            
            if (i == 0) {
                completeDays[i] = day;
            } else {
                if (completeDays[i - 1] > day) {
                    completeDays[i] = completeDays[i - 1];
                } else {
                    completeDays[i] = day;
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        int count = 1;
        for (int i = 0; i < completeDays.length - 1; i++) {
            if (i == completeDays.length - 2) {
                if (completeDays[i] == completeDays[i + 1]) {
                    count++;
                    list.add(count);
                } else {
                    list.add(count);
                    list.add(1);
                }
            } else {
                if (completeDays[i] == completeDays[i + 1]) {
                    count++;
                } else {
                    list.add(count);
                    count = 1;
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

