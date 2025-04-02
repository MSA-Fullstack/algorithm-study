import java.util.*;
class Solution {
    public Set solution(int[] numbers) {
        
        Set answer = new TreeSet();
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i!=j){
                    answer.add(numbers[i]+numbers[j]);
                } 
            }
        }
        return answer;
    }
}



