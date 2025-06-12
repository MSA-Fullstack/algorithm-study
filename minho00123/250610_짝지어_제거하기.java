import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            stack1.push(s.charAt(i));
        }
        
        int count = 0;
        int stack1Length = stack1.size();
        while (!stack1.empty()) {
            char stack1Top = stack1.pop();

            if (stack2.empty()) {
                stack2.push(stack1Top);
                count++;
            } else {
                char stack2Top = stack2.pop();
                
                if (stack1Top != stack2Top) {
                    stack2.push(stack2Top);
                    stack2.push(stack1Top);
                    count++;
                }
            }
        }
        
        if (stack1.empty() && stack2.empty()) {
            return 1;
        }

        return answer;
    }
}
  
