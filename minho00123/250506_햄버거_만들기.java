import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < ingredient.length; i++) {
            queue.add(ingredient[i]);
        }
        
        while (!queue.isEmpty()) {
            int num = queue.poll();
            stack.push(num);
            
            if (stack.peek() == 1 && stack.size() >= 4) {
                Stack<Integer> temp = new Stack<>();
                boolean isGood = true;
                temp.push(stack.pop());
                
                for (int i = 3; i >= 1; i--) {
                    int top = stack.pop();
                    temp.push(top);
                    
                    if (top == i) {
                        continue;
                    } else {
                        isGood = false;
                        break;
                    }
                }
                
                if (!isGood) {
                    while (!temp.isEmpty()) {
                        stack.push(temp.pop());
                    }
                } else {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}

