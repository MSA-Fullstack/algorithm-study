class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (true) {
            if (n < a) {
                break;
            }
            
            answer += n / a * b;
            n = n - (n / a * a) + (n / a * b);
        }
        
        return answer;
    }
}

