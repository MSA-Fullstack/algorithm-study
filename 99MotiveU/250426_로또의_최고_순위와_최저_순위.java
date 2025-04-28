class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        
        int zeroCnt = 0;
        int matchCnt = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        matchCnt++;
                        break;
                    }
                }
            }
        }
        int maxRank = 7 - (matchCnt + zeroCnt);
        int minRank = 7 - matchCnt;
        if (maxRank > 6) {
            maxRank = 6;
        }
        if (minRank > 6) {
            minRank = 6;
        }
        answer = new int[]{maxRank, minRank};
        return answer;
    }
}
