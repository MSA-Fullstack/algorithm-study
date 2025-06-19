import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int boats=0;
        int light=0; 
        int heavy=people.length - 1;
        
        while(light<=heavy){
            if(people[light]+people[heavy]<=limit){
                light++;
            }
            heavy--;
            boats++;
        }
        answer=boats;
        return answer;
    }
}
