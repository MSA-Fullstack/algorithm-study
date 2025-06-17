import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        //array를 리스트로 만들고 
        List<Integer> list = new ArrayList<>();
        Arrays.stream(array).forEach(num->list.add(Integer.valueOf(num)));
        
        for(int i = 0;i<commands.length;i++){
            List<Integer> subList = new ArrayList<>();
            IntStream.range(commands[i][0]-1,commands[i][1])
                .forEach(idx-> subList.add(list.get(idx)));
            //정렬하기
            Collections.sort(subList);
            //answer에 담기
            answer[i] = subList.get(commands[i][2]-1);
        }
        return answer;
    }
}

