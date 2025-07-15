import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i); 
        }

        int answer = 0;
        while (!queue.isEmpty()) {
        int current = queue.poll();
        boolean maxExists = false;

        for (int other : queue) {
            if (priorities[other] > priorities[current]) {
                maxExists = true;
                break;
            }
        }

        if (maxExists) {
            queue.offer(current);
            } else {
                answer++;
                if (current == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
