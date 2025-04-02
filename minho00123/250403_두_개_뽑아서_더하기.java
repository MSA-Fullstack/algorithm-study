import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        if (numbers.length == 1) {
            return numbers;
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            answer[i++] = (int) iterator.next();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}

