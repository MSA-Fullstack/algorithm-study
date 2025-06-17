import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int top = stack.peek();

            if (!(arr[i] == top)) {
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--)  {
            answer[i] = (int) stack.pop();
        }
        
        return answer;
    }
}

