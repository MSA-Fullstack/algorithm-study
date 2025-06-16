import java.util.Stack;

public class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) { // 비어있으면서, 바라보는 곳과 같다면 
                stack.pop();
                }
            else {
                    stack.push(ch); 
                }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}


