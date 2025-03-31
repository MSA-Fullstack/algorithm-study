import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int temp = arr[0];
        int cnt =0;
        for(int i =1;i<arr.length;i++){
            if(temp==arr[i]){
                arr[i]=-1;
                cnt++;
            }else{
                temp = arr[i];
            }
        }
        //배열 복사하기
        answer = new int[arr.length-cnt];
        int idx = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=-1){
                answer[idx++]=arr[i];
            }

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


