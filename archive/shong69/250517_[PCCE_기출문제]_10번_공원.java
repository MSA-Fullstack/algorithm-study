import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int H = park.length;
        int W = park[0].length;

        /* 1. 돗자리 한 변 길이 후보를 내림차순으로 정렬(중복 제거) */
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int m : mats) set.add(m);

        /* 2. 가장 큰 크기부터 시도 */
        for (int k : set) {
            for (int r = 0; r + k <= H; r++) {
                for (int c = 0; c + k <= W; c++) {
                    if (isEmptySquare(park, r, c, k)) return k; 
                }
            }
        }
        return -1; 
    }

    /* r,c에서 시작하는 k×k 영역에 사람이 없는지 확인 */
    private boolean isEmptySquare(String[][] park, int r, int c, int k) {
        for (int i = r; i < r + k; i++) {
            for (int j = c; j < c + k; j++) {
                if (!park[i][j].equals("-1")) return false;
            }
        }
        return true;
    }
}
