class Solution {
    public int solution(int n) {
        int answer = 0;
        int mod = 1234567;
        long fib1 = 0;
        long fib2 = 1;
        long fibonacci = 0;
        
        for (int i = 2; i <= n; i++) {
            fibonacci = (fib1 + fib2)%mod;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        answer=(int)fibonacci%1234567;
        return answer;
    }
}
