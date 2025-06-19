import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> tgCnt=new HashMap<>();
        for(int size: tangerine){
            tgCnt.put(size, tgCnt.getOrDefault(size,0)+1);
        }
        
        List<Integer> cnt=new ArrayList<>(tgCnt.values());
        Collections.sort(cnt, Collections.reverseOrder());
        
        int count=0;
        
        for(int c:cnt){
            count+=c;
            answer++;
            
            if(count>=k) break;
        }
        return answer;
    }
}
