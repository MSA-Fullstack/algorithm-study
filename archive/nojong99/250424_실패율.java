import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] reach = new int[N]; // 도달한 사람 수
        int[] over = new int[N];  // 실패한 사람 수
        double[] rate = new double[N];  // 실패율

        // 각 스테이지에 도달한 사람과 실패한 사람 수 계산
        for (int i = 0; i < stages.length; i++) {
            for (int j = 0; j < N; j++) {
                if (stages[i] == j + 1) {
                    reach[j]++;
                }
                if (stages[i] >= j + 1) {
                    over[j]++;
                }
            }
        }

        // 실패율 계산
        for (int j = 0; j < N; j++) {
            if (over[j] != 0) {
                rate[j] = (double) reach[j] / over[j];
            } else {
                rate[j] = 0;
            }
        }

        // 실패율을 기준으로 내림차순 정렬
        Integer[] lst = new Integer[N];
        for (int i = 0; i < N; i++) {
            lst[i] = i;
        }

        Arrays.sort(lst, (a, b) -> {
            if (rate[b] == rate[a]) { // 실패율이 같으면
                return a - b; // 오름차순
            }
            return Double.compare(rate[b], rate[a]); // 실패율 내림차순
        });

        // 정렬된 인덱스를 바탕으로 결과를 반환
        for (int i = 0; i < N; i++) {
            answer[i] = lst[i] + 1; // 인덱스는 0부터 시작하므로, +1을 해줍니다.
        }

        return answer;
    }
}


