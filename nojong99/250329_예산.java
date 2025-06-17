import java.util.Arrays;

class Solution {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            budget = budget-d[i];
            answer++;
            if(budget==0) {
            	break;
            }
            else if(budget<0) {
            	answer--;
            }
        }
        return answer;
    }
}


