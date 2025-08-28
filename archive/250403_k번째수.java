import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        int i, j, k=0;
        
        for(int n=0; n<commands.length; n++) {
            int cnt=0;
            i=commands[n][0];
            j=commands[n][1];
            k=commands[n][2];
        
            int[] temp = new int[j-i+1];
            
            for(int m=i-1; m<j; m++) {
                temp[cnt] = array[m];
                cnt++;
                };

            Arrays.sort(temp);
            
            answer[n] = temp[k-1];
            }
        
        return answer;
    }
}

