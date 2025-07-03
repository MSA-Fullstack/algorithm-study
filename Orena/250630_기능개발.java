import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> list=new LinkedList<>();
        Iterator it = list.iterator();
        List<Integer> ans=new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            list.add(days);
        }
        
         while (!list.isEmpty()) {
            int currentDay = list.poll();
            int count = 1; 

            while (!list.isEmpty() && currentDay >= list.peek()) {
                list.poll();
                count++;
            }
            
            ans.add(count);
        }

        int[] answer = ans.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
