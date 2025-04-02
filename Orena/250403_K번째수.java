import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
        int[][] temp=new int[commands.length][];
        for(int i=0; i<commands.length; i++) {
            temp[i]=new int[commands[i][1]-commands[i][0]+1];
            temp[i]=Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp[i]);
        }
        for(int i=0; i<answer.length; i++){
            answer[i]=temp[i][commands[i][2]-1];
        }
        
        return answer;
    }
}

