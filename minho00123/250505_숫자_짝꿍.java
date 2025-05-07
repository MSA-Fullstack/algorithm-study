import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        char[] x = X.toCharArray();
        char[] y = Y.toCharArray();
        
        for (int i = 0; i < x.length; i++) {
            countX[x[i] - '0']++;
        }
        
        for (int i = 0; i < y.length; i++) {
            countY[y[i] - '0']++;
        }
        
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(countX[i], countY[i]); j++) {
                answer.append(String.valueOf(i));
            }
        }
        
        if (answer.length() == 0) {
            return "-1";
        } else if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
}

