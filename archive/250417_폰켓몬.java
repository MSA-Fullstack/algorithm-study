import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int choose = nums.length/2;
        Set<Integer> kinds= new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
            kinds.add(nums[i]);
        }
        
        if(kinds.size()< choose) {
           return kinds.size(); 
        }else return choose;
    }
}



