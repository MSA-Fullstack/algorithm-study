import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        int num = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(num != arr[i]){
                stack.push(arr[i]);
                num = arr[i];
            }
        }
        answer = new int[stack.size()];
        for(int i = 0;i<answer.length;i++){
            answer[answer.length-i-1]=stack.pop();
        }
        return answer;
    }
}

