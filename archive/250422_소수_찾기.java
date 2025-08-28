class Solution {
    public int solution(int n) {
        int answer = 0;
        //에라토스테네스의 체 방법
        //소수의 배수(소수가 아닌 수)를 제외시키는 방식
        boolean[] isNotPrime=new boolean[n+1];
        //0과 1은 소수가 아님
        isNotPrime[0]=isNotPrime[1]=true;
        
        for(int i=2; i*i<=n; i++){
            if(!isNotPrime[i]){
            //이미 전에 빼버린 수를 제외시키기 위해 i*i부터 시작
                for(int j=i*i; j<=n; j+=i){
                   isNotPrime[j]=true;
                }
            }
        }
        
        for(int i=2; i<n+1; i++){
            if(!isNotPrime[i]) answer++;
        }
        
        return answer;
    }
}

