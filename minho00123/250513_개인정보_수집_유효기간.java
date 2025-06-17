import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < terms.length; i++) {
            String[] term = terms[i].split(" ");
            map.put(term[0], Integer.parseInt(term[1]) * 28);
        }
        
        String[] tdy = today.split("\\.");
        int tdyYear = Integer.parseInt(tdy[0]) - 2000;
        int tdyMonths = (tdyYear * 12) + Integer.parseInt(tdy[1]);
        int tdyDays = (tdyMonths * 28) + Integer.parseInt(tdy[2]);
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String type = privacy[1];
            String[] date = privacy[0].split("\\.");
            int privacyYear = Integer.parseInt(date[0]) - 2000;
            int privacyMonths = (privacyYear * 12) + Integer.parseInt(date[1]);
            int privacyDays = (privacyMonths * 28) + Integer.parseInt(date[2]);
            
            int daysDiff = tdyDays - privacyDays;
            int termDays = map.get(type);

            if (daysDiff >= termDays) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

