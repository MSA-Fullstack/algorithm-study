class Solution {
    public long solution(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        
        long prev1=1;
        long prev2=2;
        long answer = 0;

        for(int i=3; i<=n; i++){
            answer=(prev1+prev2) % 1234567;
            prev1=prev2;
            prev2=answer;
        }
        return answer;
    }
}
