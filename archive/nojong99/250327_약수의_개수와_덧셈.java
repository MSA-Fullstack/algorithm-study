class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int j=left; j<=right; j++){
            int t=0;
            for(int i=1; i<=j; i++){
                if(j%i==0){
                    t++;
                }           
            }
            if(t%2==0){
                answer=answer+j;
            }
            else{
                answer=answer-j;
            }
            
        }
        return answer; 
    }
}


