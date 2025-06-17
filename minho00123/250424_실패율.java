import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int totalUserCount = stages.length;
        int[] stageUserCount = new int[N];
        float[] failureRate = new float[N];
        int[] answer = new int[N];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                stageUserCount[stages[i] - 1]++;
            }
        }

        for (int i = 0; i < N; i++) {
            if (totalUserCount == 0) {
                failureRate[i] = 0;
            } else {
                failureRate[i] = (float) stageUserCount[i] / totalUserCount;
                totalUserCount -= stageUserCount[i];
            }
        }
        
        float[] failureRateSort = Arrays.copyOf(failureRate, N);
        Arrays.sort(failureRateSort);
        
        int index = 0;
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                if (failureRateSort[i] == failureRate[j]) {
                    answer[index++] = j + 1;
                    failureRate[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}

