class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int num = n - i * (i - 1) / 2;
            if(num <= 0) break;
            if(num % i == 0) answer++; 
        }
        return answer;
    }
}
