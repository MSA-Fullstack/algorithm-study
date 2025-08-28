import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int size: tangerine) {
        	//빈도수 구하기
        	counts.put(size, counts.getOrDefault(size, 0)+1);
        }
        // 빈도 수를 기준으로 정렬하기 -> value를 추출하여 담은 후 정렬
        List<Integer>CountSort = new ArrayList<>(counts.values());
        Collections.sort(CountSort, Collections.reverseOrder());
        // 종류의 개수 구하기
        for(int s : CountSort) {
        	if(k<=s) {
        		answer++;
        		break;
        	}else {
        		k-=s;
        		answer++;
        	}
        }
        return answer;
    }
}

