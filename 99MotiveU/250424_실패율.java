import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] stageCnt = new int[N + 2]; 

        for (int lvl : stages) {
            if (lvl <= N + 1) {
                stageCnt[lvl]++;
            }
        }

        int tot = stages.length;
        List<double[]> failList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int clearX = stageCnt[i]; 
            double failRate = tot == 0 ? 0 : (double) clearX / tot;
            failList.add(new double[]{i, failRate});
            tot -= clearX;
        }

        Collections.sort(failList, (a, b) -> {
            if (Double.compare(b[1], a[1]) == 0) {
                return (int) (a[0] - b[0]); // 실패율 같으면 오름차순
            }
            return Double.compare(b[1], a[1]); // 실패율 내림차순
        });

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = (int) failList.get(i)[0];
        }
        answer = result;
        return answer;
    }
}
