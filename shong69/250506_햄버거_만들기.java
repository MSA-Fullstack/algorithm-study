import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        Deque<Integer> que = new ArrayDeque<>();
        int answer = 0;
        
        for(Integer i:ingredient){
            que.push(i);
            if(que.size()>=4&&que.peek()==1){
                int a = que.pop();
                int b = que.pop();
                int c = que.pop();
                int d = que.pop();
                if(b==3&&c==2&&d==1){
                    answer++;
                }else{
                    que.push(d);
                    que.push(c);
                    que.push(b);
                    que.push(a);
                }
            }
        }
        return answer;
    }
}

