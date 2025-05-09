import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int extIdx = map.get(ext);
        int sortIdx = map.get(sort_by);
        
        List<int[]> extract = new ArrayList<>();
        
        for(int i=0; i<data.length; i++){
            if(data[i][extIdx]<val_ext){
                extract.add(data[i]);
            }
        }
        
        int[][] answer =  extract.toArray(new int[extract.size()][]);
        
        Arrays.sort(answer, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[sortIdx], b[sortIdx]);
            }
        });
        return answer;
    }
}

