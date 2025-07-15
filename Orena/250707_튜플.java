import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length()- 2).replace("},{", "-");
        String[] sArr = s.split("-");

        Arrays.sort(sArr, Comparator.comparingInt(String::length));

        List<Integer> list = new ArrayList<>();

        for (String el : sArr) {
            String[] check = el.split(",");

            for (int i = 0; i < check.length; i++) {
                int num = Integer.parseInt(check[i]);

                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
