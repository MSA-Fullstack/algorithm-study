import java.util.*; 
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<Integer> list = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).
            boxed().collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        sb.append(Collections.min(list));
        sb.append(" ");
        sb.append(Collections.max(list));
        answer = sb.toString();
        return answer;
    }
}

