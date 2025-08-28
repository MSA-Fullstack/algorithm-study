import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer tan:tangerine){
            map.put(tan,map.getOrDefault(tan,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        int sum =0;
        int kind =0;
        for(int val:list){
            sum+=val;
            kind++;
            if(sum>=k) break;
        }
        return kind;
    }
}

