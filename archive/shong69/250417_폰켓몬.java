import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;        
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(n>=set.size()){
            answer= set.size();
        }else{
            answer = n;
        }
        return answer;
    }
}

