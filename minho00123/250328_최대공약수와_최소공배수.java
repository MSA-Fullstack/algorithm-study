class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int gcd = 1;
        
        for (int i = 2; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        
        int lcm = gcd * (n / gcd) * (m / gcd);
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
}

