class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int matchingNumbers = 0;
        int zeroCounts = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCounts++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    matchingNumbers++;
                    break;
                }
            }
        }
        
        if (zeroCounts == 6) {
            return new int[] { 1, 6 };
        }
        
        if (matchingNumbers == 6) {
            return new int[] { 1, 1 };
        } else if (matchingNumbers == 5) {
            return new int[] { 2 - zeroCounts, 2 };
        } else if (matchingNumbers == 4) {
            return new int[] { 3 - zeroCounts, 3 };
        } else if (matchingNumbers == 3) {
            return new int[] { 4 - zeroCounts, 4 };
        } else if (matchingNumbers == 2) {
            return new int[] { 5 - zeroCounts, 5 };
        } else {
            return new int[] { 6 - zeroCounts, 6 };
        }
    }
}

