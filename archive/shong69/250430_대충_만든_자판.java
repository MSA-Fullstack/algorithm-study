import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int j=0;j<targets.length;j++){
            char[] arr = targets[j].toCharArray();
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                int minIdx = 100;
                for(String key:keymap){
                    int idx = key.indexOf(arr[i]);
                    if(idx!=-1) minIdx = Math.min(minIdx, idx+1);
                }
                if(minIdx == 100){
                    sum = -1;
                    break;
                }
                sum += minIdx;
            }
            answer[j] = sum;
        }   
        return answer;
    }
}

