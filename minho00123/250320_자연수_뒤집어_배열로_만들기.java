import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList arr = new ArrayList();
        
        while (n > 0) {
            arr.add((n % 10));
            n /= 10;
        }

        Object[] temp = arr.toArray();
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = (Integer) temp[i];
        }

        return answer;
    }
}

