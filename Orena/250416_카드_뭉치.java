import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> que1=new LinkedList<>(Arrays.asList(cards1));
		Queue<String> que2=new LinkedList<>(Arrays.asList(cards2));
		Queue<String> que3=new LinkedList<>(Arrays.asList(goal));
		Object obj=null;
		for(int i=0; i<goal.length; i++) {
			if(goal[i].equals(que1.peek())) {
				que1.poll();
				que3.poll();
			}
			if(goal[i].equals(que2.peek())) {
				que2.poll();
				que3.poll();
			}
		}
		if(que3.isEmpty()) answer="Yes";
		else answer="No";
        return answer;
    }
}

