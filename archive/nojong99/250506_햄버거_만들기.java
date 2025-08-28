import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        //1321
        Stack<Integer> stk = new Stack();
        
         for (int i = 0; i < ingredient.length; i++) {
            stk.push(ingredient[i]);
            if (stk.size() >= 4) {
                int size = stk.size();
                if (stk.get(size - 1) == 1 && stk.get(size - 2) == 3 && stk.get(size - 3) == 2 && stk.get(size - 4) == 1) {
                    
                    for(int j=0; j<4; j++){
                        stk.pop();
                    }
                    answer++;
                }
            }
         }
        return answer;
    }
}

