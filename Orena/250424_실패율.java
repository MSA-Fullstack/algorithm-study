import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> fail = new HashMap<>();
        int player=stages.length;
        
        Arrays.sort(stages);
        
        for(int i=1; i<=N; i++){
	//각 스테이지에 도달해 있는 플레이어 수 count 하기
            int idx=Arrays.binarySearch(stages,i);
            
            if(idx>=0) {
            	int left=idx;
            	while(left>0&&stages[left-1]==i) {
            		left--;
            	}
            	int right=idx;
            	while(right<stages.length-1 && stages[right+1]==i) {
            		right++;
            	}
            	//map에 stage 번호와 실패율을 저장
            	fail.put(i,(double)(right+1-left)/player*100);
            	player=player-(right+1-left);
            } else {
            	fail.put(i, 0.0);
            }
            
        }
        //배열을 내림차순으로 정렬하기 위해 list에 저장
        List<Integer> list = new ArrayList<>(fail.keySet());
        Collections.sort(list, (o1,o2) -> Double.compare(fail.get(o2), fail.get(o1)));
        //list를 stream으로 변환하고 Integer를 int로 바꾼 뒤 answer 배열에 저장
        answer=list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
