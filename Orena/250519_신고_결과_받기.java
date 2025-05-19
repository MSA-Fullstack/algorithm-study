import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer=new int[id_list.length];
        
        Set<String> repoSet=new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> repoCount=new HashMap<>();
        for(int i=0; i<id_list.length; i++) {
            repoCount.put(id_list[i], 0);
        }
        for(String re:repoSet) {
            String reported=re.split(" ")[1];
            repoCount.put(reported, repoCount.get(reported)+1);
        }
        
        Map<String, List<String>> reporters=new HashMap<>();
        for(int i=0; i<id_list.length; i++) {
            reporters.put(id_list[i], new ArrayList<>());
        }
        // 신고 당한 사람(키)에 신고한 사람을 list로 저장
        for(String re:repoSet) {
            String reporter=re.split(" ")[0];
            String reported=re.split(" ")[1];
            reporters.get(reported).add(reporter);
        }
        
        // id_list를 순서-idx로 mapping
        Map<String, Integer> idIndexMap = new HashMap<>();
        for(int i=0;i<id_list.length;i++) {
            idIndexMap.put(id_list[i], i);
        }
        
        for(int i=0; i<id_list.length; i++) {
            String id=id_list[i];
            if(repoCount.get(id)>=k) {
                for(String reporter:reporters.get(id)) {
                    int idx = idIndexMap.get(reporter);
                    answer[idx]++;
                }
            }
        }
        return answer;
    }
}
