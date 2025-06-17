import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> reportNum = new HashMap<>();
        Map<String, List<String>> reportNames = new HashMap<>(); 
        
        for (int i = 0; i < id_list.length; i++) {
            List<String> temp = new ArrayList<>();
            reportNum.put(id_list[i], 0);
            reportNames.put(id_list[i], temp);
        }
        
        for (int i = 0; i < report.length; i++) {
            String[] names = report[i].split(" ");

            List<String> nameList = reportNames.get(names[0]);

            if (!nameList.contains(names[1])) {
                nameList.add(names[1]);
                reportNames.replace(names[0], nameList);
                
                int count = reportNum.get(names[1]) + 1;
                reportNum.replace(names[1], count);
            }
        }
        
        List<String> finalNames = new ArrayList<>();
        
        for (int i = 0; i < id_list.length; i++) {
            if (reportNum.get(id_list[i]) >= k) {
                finalNames.add(id_list[i]);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            List<String> nameList = reportNames.get(id_list[i]);
            int mailCount = 0;
            for (int j = 0; j < nameList.size(); j++) {
                for (int l = 0; l < finalNames.size(); l++) {
                    if (nameList.get(j).equals(finalNames.get(l))) {
                        mailCount++;
                    }
                }
            }
            
            answer[i] = mailCount;
        }

        return answer;
    }
}

