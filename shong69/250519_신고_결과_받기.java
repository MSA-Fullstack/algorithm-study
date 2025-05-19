import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> repoList = new HashMap<>();
        Map<String, Integer> cntList = new HashMap<>();
        for (String rep : report) {
            int idx = rep.indexOf(' ');
            String reporter = rep.substring(0, idx);
            String reported = rep.substring(idx + 1);

            repoList.putIfAbsent(reporter, new HashSet<>());
            // 새로 신고하는 경우에만 처리
            boolean isFirst = repoList.get(reporter).add(reported);
            if (isFirst) {
                cntList.put(reported, cntList.getOrDefault(reported, 0) + 1);
            }
        }
        // 정지 기준 이상 신고당한 유저 찾기
        Set<String> banned = new HashSet<>();
        for (Map.Entry<String, Integer> entry : cntList.entrySet()) {
            if (entry.getValue() >= k) {
                banned.add(entry.getKey());
            }
        }

        // 각 유저가 신고한 사람 중 정지당한 사람 수를 세어 answer에 반영
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> reportedSet = repoList.getOrDefault(user, Collections.emptySet());
            int count = 0;
            for (String reportedUser : reportedSet) {
                if (banned.contains(reportedUser)) {
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}

