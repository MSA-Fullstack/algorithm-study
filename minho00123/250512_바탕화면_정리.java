import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {51, 51, -1, -1};
        
        for (int i = 0; i < wallpaper.length; i++) {
            String line = wallpaper[i];
            
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '#') {
                    if (i < answer[0]) {
                        answer[0] = i;
                    }
                    
                    if (j < answer[1]) {
                        answer[1] = j;
                    }
                    
                    if (i + 1 > answer[2]) {
                        answer[2] = i + 1;
                    }
                    
                    if (j + 1 > answer[3]) {
                        answer[3] = j + 1;
                    }
                }
            }
        }
        
        return answer;
    }
}

