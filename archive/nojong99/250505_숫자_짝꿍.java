import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> mapX = new HashMap();
        Map<Character, Integer> mapY = new HashMap();
        
        for (char c : X.toCharArray()) {
            mapX.put(c, mapX.getOrDefault(c, 0) + 1);
        }

        for (char c : Y.toCharArray()) {
            mapY.put(c, mapY.getOrDefault(c, 0) + 1);
        }
         
        // 역순으로 큰 숫자부터 개수를 구하고, answer 문자열에 그냥 더하기
        for (char ch = '9'; ch >= '0'; ch--) {
            int countX = mapX.getOrDefault(ch, 0);
            int countY = mapY.getOrDefault(ch, 0);
            int cnt = Math.min(countX, countY);

            for (int i = 0; i < cnt; i++) {
                sb.append(ch);  
            }
        }

        answer=sb.toString();
         
        if (answer.equals("")){
            answer= "-1";
        }
        if (answer.startsWith("0")) {
            answer = "0";
            };

         
        return answer;
    }
}

