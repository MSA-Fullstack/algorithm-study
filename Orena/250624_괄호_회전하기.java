import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int rotation = 0; rotation < s.length(); rotation++) {
            String rotated = s.substring(rotation) + s.substring(0, rotation);
            
            if (isValidParentheses(rotated)) {
                answer++;
            }
        }
        
        return answer;
    }
     private boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
