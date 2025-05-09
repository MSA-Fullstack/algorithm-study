import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> extList = new ArrayList<>();
        Map<String, Integer> extIndex = new HashMap<>();
        
        extIndex.put("code", 0);
        extIndex.put("date", 1);
        extIndex.put("maximum", 2);
        extIndex.put("remain", 3);
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIndex.get(ext)] < val_ext) {
                extList.add(data[i]);
            }
        }

        int index = extIndex.get(sort_by);
        extList.sort((list1, list2) -> {
            return list1[index] - list2[index];
        });
        
        int[][] answer = new int[extList.size()][4];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = extList.get(i);
        }
        
        return answer;
    }
}

