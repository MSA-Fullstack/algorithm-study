import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);  
        int N = park.length;
        int M = park[0].length;

        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            if (size > N || size > M) continue; 

            for (int row = 0; row <= N - size; row++) {
                for (int col = 0; col <= M - size; col++) {
                    boolean canLay = true;
                    for (int r = 0; r < size; r++) {
                        for (int c = 0; c < size; c++) {
                            if (!park[row + r][col + c].equals("-1")) {
                                canLay = false;
                                break;
                            }
                        }
                        if (!canLay) break;
                    }
                    if (canLay) {
                        return size;  
                    }
                }
            }
        }
        return -1; 
    }
}
