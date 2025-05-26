class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            
            int j = i;
            while(sum <= n) {
                if (sum == n) {
                    answer++;
                }
                sum += j;
                j++;
            }
        }
        
        return answer;
    }
}

