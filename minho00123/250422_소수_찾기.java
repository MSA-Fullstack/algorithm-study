class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] checkPrimeNumber = new boolean[n + 1];
        
        for (int i = 2; i <= n; i++) {
            if (checkPrimeNumber[i] == false) {
                answer++;
                for (int j = i + i; j < checkPrimeNumber.length; j += i) {
                    checkPrimeNumber[j] = true;
                }
            }
        }
        
        return answer;
    }
}

