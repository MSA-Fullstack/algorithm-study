import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        List<String> list=Arrays.asList(discount);
        
        for(int j=0; j<=list.size()-10; j++){
            List<String> cut=list.subList(j, j+10);
            boolean isAllSatisfied = true;
            for(int i=0; i<want.length; i++){
                int count = Collections.frequency(cut,want[i]);
                if(count<number[i]) {
                    isAllSatisfied = false;
                    break;
                } 
            }
            if(isAllSatisfied){
                answer++;
            }
        }
        	
        return answer;
    }
}
