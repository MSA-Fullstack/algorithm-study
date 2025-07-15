import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};

        s = s.substring(2, s.length() - 2);

        String[] arr = s.split("},\\{");
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (String group : arr) {
            String[] numbers = group.split(",");
            for (String numStr : numbers) {
                int num = Integer.parseInt(numStr);
                if (!seen.contains(num)) {
                    seen.add(num);
                    result.add(num);
                }
            }
        }
        
        answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
