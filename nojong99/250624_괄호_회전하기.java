import java.util.*;

class Solution {
    // 올바른 문자열 찾는 함수
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 

        for (char ch : s.toCharArray()) { 
            if (ch == '(' || ch == '[' || ch == '{') { 
                stack.push(ch); 
            } else { 
                if (stack.isEmpty()) { 
                    return false;
                }

                char top = stack.pop(); 
                // 짝이 맞는지 여부 확인
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false; 
                }
            }
        }
        
        return stack.isEmpty();
    }

    public int solution(String s) {
        int answer = 0; 
        int n = s.length(); 

        
        for (int x = 0; x < n; x++) {
            
            String rotated_s = s.substring(x) + s.substring(0, x);

            
            if (isValid(rotated_s)) {
                answer++; // 올바르면 개수 증가
            }
        }

        return answer; 
    }
}

