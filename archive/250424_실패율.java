import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int cnt=0;
        int reachedUsers=1;
        int totalUsers=stages.length;
        Map List=new HashMap();
        
        //for로 스테이지 i랑 동일한 개수를 구해서 해당 스테이지에 머무르고 있는 유저 수 cnt, cnt/users 실패율
        for(int i=1; i<N+1; i++){
            //n+1인 경우(다 클리어한 유저)에는 필요없으므로 세지 않음
            cnt=0;
             for (int j = 0; j < stages.length; j++) {
                // 해당 사용자가 현재 i번 스테이지에 있다면 cnt 증가
                if (stages[j] == i) {
                    cnt = cnt + 1;
                }
             }
            double failRate = 0.0;
            if (totalUsers != 0) {
                failRate = (double)cnt/totalUsers;
            }
            List.put(i, failRate);
            totalUsers = totalUsers - cnt;
        }
        
          // 실패율을 내림차순 정렬하되, 실패율이 같으면 스테이지 번호가 작은 순으로 정렬
        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(List.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                // 실패율이 같으면 스테이지 번호 오름차순 정렬
                if (Double.compare(o2.getValue(), o1.getValue()) == 0) {
                    return Integer.compare(o1.getKey(), o2.getKey());
                }
                // 실패율 내림차순 정렬
                return Double.compare(o2.getValue(), o1.getValue());
            }
        });
        // 정렬된 결과에서 스테이지 번호만 추출
        for (int i = 0; i < entryList.size(); i++) {
            answer[i] = entryList.get(i).getKey();
        }

        return answer;
    }

}

