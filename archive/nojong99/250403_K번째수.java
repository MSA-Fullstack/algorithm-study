import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            ArrayList list = new ArrayList();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                list.add(array[j]);
                list.sort(null);
                
            }answer[i]=(int)list.get(commands[i][2]-1);
            
        }
        
        return answer;
    }
}

