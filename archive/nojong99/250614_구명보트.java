import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int hw = people.length-1;  
        int lw = 0;
        
        while(lw<=hw){
            answer++;
            if(people[lw]+people[hw]<=limit){
                lw++;
            }
            hw--;
        }       
     
        return answer;
    }
}

