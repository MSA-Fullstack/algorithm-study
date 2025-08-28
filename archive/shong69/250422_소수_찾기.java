class Solution {
    public int solution(int n) {
        int answer = 0;
        //특정 수가 소수라면 그 배수들은 소수가 아니다
        boolean[] isSu = new boolean[n+1];
        isSu[0]= true; 
        isSu[1] = true;
        
        for(int i=2;i*i<=n;i++){
            if(!isSu[i]){
                for(int j=i*i;j<=n;j+=i){
                    isSu[j]=true;
                }
            }
        }
        for(int i=2;i<n+1;i++){
            if(!isSu[i])answer++;
        }
        return answer;
    }
}

