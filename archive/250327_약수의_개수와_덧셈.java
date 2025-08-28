class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int num=left; num<=right; num++) {
            int divisor=0;
            
            for(int i=1; i<=num; i++) {
                if(num%i==0) {
                    divisor++;
                };
            }
            
            if(divisor%2==0) { 
            answer += num;
            } else answer -= num;
        }
        return answer;
    }
}

