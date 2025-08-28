class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++){
            for(int j=2; j*j<=i; j++){
                if(i!=j && i%j==0){
                    answer++;
                    break;
                }
            }
        }
        answer=n-answer-1; //1빼주기 
        return answer;
    }
}

