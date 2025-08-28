import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        List<Integer> list = new ArrayList<>(); 
        for (long i = left; i <= right; i++) {
            //큰 값을 값으로 할당
            int value = (int)Math.max(i / n, i % n) + 1;
            list.add(value);
        }

        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
}

