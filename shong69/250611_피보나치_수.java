class Solution {
    public int solution(int n) {
        int answer = 0;
        long[] fibo = new long[n+1];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=1;i<n;i++){
            fibo[i+1] = (fibo[i]+fibo[i-1])%1234567;
        }
        answer = (int)fibo[n];
        return answer;
    }
}

