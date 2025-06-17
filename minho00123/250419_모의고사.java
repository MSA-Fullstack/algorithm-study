import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = { 1, 2, 3, 4, 5 };
        int[] supo2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] supo3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length ; i++) {
            if (answers[i] == supo1[i % 5]) {
                scores[0]++;
            }
            
            if (answers[i] == supo2[i % 8]) {
                scores[1]++;
            }
            
            if (answers[i] == supo3[i % 10]) {
                scores[2]++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < 3; i++) {
            if (scores[i] > scores[list.get(0) - 1]) {
                list.set(0, i + 1);
            } else if (scores[i] == scores[list.get(0) - 1]) {
                list.add(i + 1);
            }
        }
        
        Object[] obj = list.toArray();
        int[] answer = new int[obj.length];
        for (int i = 0; i < obj.length; i++) {
            answer[i] = (int) obj[i];
        }
        
        return answer;
    }
}

