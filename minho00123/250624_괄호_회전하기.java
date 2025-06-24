import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            for (int j = i; j < s.length() + i; j++) {
                if (ch[j % s.length()] == '(' || ch[j % s.length()] == '[' || ch[j % s.length()] == '{') {
                    stack.push(ch[j % s.length()]);
                } else if (ch[j % s.length()] == ')') {
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                } else if (ch[j % s.length()] == ']') {
                    if (!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                } else if (ch[j % s.length()] == '}') {
                    if (!stack.empty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            
            if (isValid && stack.empty()) {
                answer++;
            }
        }
        
        return answer;
    }
}

