import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> select2sum = new TreeSet<>();
        
        // 두 수를 뽑아 더해서 set에 저장
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                select2sum.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 배열로 변환
        int[] answer = new int[select2sum.size()];
        int index = 0;
        for (int num : select2sum) {
            answer[index++] = num;
        }
        return answer;
    }
}
