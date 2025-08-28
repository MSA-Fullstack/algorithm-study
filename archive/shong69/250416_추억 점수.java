import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> list = Arrays.asList(name); 
        for(int i=0;i<photo.length;i++){
            int sum= 0;
            for(int j=0;j<photo[i].length;j++){
                int idx = list.indexOf(photo[i][j]);
                if(idx !=-1){
                    sum += yearning[idx];
                }
            }
            answer[i]= sum;
        }
        return answer;
    }
}

