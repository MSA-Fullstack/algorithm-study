class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int targetRow = (num - 1) / w;
        int targetCol = targetRow % 2 == 0 ? (num - 1) % w : w - 1 - (num - 1) % w;

        for (int i = targetRow; i * w < n; i++) {
            int col = i % 2 == 0 ? targetCol : w - 1 - targetCol;
            if (i * w + col < n) answer++;
        }
        return answer;
    }
}
