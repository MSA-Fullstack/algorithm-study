import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        HashSet<Character> skipSet = new HashSet<>();
        
        // contain 사용 위해서 skip 문자열의 문자들을 HashSet에 저장
        for(int i=0; i<skip.toCharArray().length; i++){
            skipSet.add(skip.charAt(i));
        }
        
        for (int i=0; i<s.toCharArray().length; i++) {
            int idx = 0;
            char current = s.charAt(i);
            
            // index만큼 이동하면서 skip 문자 건너뛰기
            while (idx < index) {
                current++;
                if (current > 'z') current = 'a';
                if (!skipSet.contains(current)) idx++;
            }
            
            answer+=String.valueOf(current);
        }
        
        return answer;
    }
}

