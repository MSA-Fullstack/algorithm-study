import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
 	int answer = 0;
        int n = friends.length;

        Map<String, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            idxMap.put(friends[i], i);
        }

        int[][] give = new int[n][n];
        int[] given = new int[n];
        int[] received = new int[n];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int from = idxMap.get(parts[0]);
            int to = idxMap.get(parts[1]);
            give[from][to]++;
            given[from]++;
            received[to]++;
        }

        int[] nextMonthGifts = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (give[i][j] > give[j][i]) {
                    nextMonthGifts[i]++;
                } else if (give[i][j] < give[j][i]) {
                    nextMonthGifts[j]++;
                } else {
                    int scoreI = given[i] - received[i];
                    int scoreJ = given[j] - received[j];
                    if (scoreI > scoreJ) nextMonthGifts[i]++;
                    else if (scoreI < scoreJ) nextMonthGifts[j]++;
                }
            }
        }

        for (int g : nextMonthGifts) {
            answer = Math.max(answer, g);
        }
        return answer;
    }
}
