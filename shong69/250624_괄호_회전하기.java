import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int j = 0; j < n; j++) {
                char ch = rotated.charAt(j);

                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char open = stack.pop();
                    if ((open == '(' && ch != ')') ||
                        (open == '[' && ch != ']') ||
                        (open == '{' && ch != '}')) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}

