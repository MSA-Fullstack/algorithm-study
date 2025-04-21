import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] temp = new Integer[score.length];
        
        for (int i = 0; i < score.length; i++) {
            temp[i] = score[i];
        }
        
        Arrays.sort(temp, Collections.reverseOrder());
        
        int index = m - 1;
        for (int i = 0; i < temp.length / m; i++) {
            answer += temp[index] * m;
            index += m;
        }
        
        return answer;
    }
}

