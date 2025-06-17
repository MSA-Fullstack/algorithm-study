import java.util.stream.*;
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set set = new HashSet();
        for(int i =0;i<numbers.length;i++){
            int num = numbers[i]; //range에서 i가 쓰여 인자가 바뀔 위험이 있어 변수로 저장
            IntStream.range(i+1,numbers.length)
                .forEach(idx -> set.add(num+numbers[idx]));
        }
        answer = set
            .stream()
            .mapToInt(num->(int)num)
            .sorted() //오름차순 정렬
            .toArray();
        return answer;
    }
}

