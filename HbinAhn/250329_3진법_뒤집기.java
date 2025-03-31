import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> su=new Stack<>();
        
        while(n>0) {
           su.push(n % 3);
            n= n/3;
        }
        
        int pl = 1;
        while (!su.isEmpty()) {
            answer += su.pop() * pl;
            pl = 3*pl;  
        }

        return answer;
        
    }
}

