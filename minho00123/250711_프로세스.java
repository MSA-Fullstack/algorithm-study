import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        
        for (int i = 0; i < priorities.length; i++) {
            int[] temp = new int[]{priorities[i], i};
            queue.offer(temp);
        }
        
        while (true) {
            int[] info = queue.poll();
            int priority = info[0];
            int loc = info[1];
            boolean isBig = false;
            ArrayDeque<int[]> copy = queue.clone(); 
            
            while (!copy.isEmpty()) {
                int[] temp = copy.poll();
                
                if (priority < temp[0]) {
                    isBig = true;
                    break;
                }
            }
            
            
            if (isBig) {
                queue.offer(info);
            } else {
                if (loc == location) {
                    return answer;
                } else {
                    answer++;
                }
            }
        }
    }
}

