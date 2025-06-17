import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        Collections.addAll(queue1,cards1);
        Collections.addAll(queue2,cards2);        
        boolean isTrue = true;
        for(int i=0;i<goal.length;i++){
            if(goal[i].equals(queue1.peek())){
                queue1.remove();
            }else if(goal[i].equals(queue2.peek())){
                queue2.remove();
            }else{
                isTrue = false;
                break;
            }
        }
        return isTrue?"Yes":"No";
    }
}

