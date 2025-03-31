class Solution {
    public static int solution(long num) {
        int answer = 0;
        int cnt=0;

	while(num!=1 ){
            if(num%2==0){
                num/=2;
                cnt++;
                answer=cnt;
            }
            else if(num%2==1 ){
                num=(num*3)+1;
                cnt++;
                answer=cnt;
            }
            if(cnt>=500) {
            	answer=-1;
            	break;
            }
	}
        return answer;
     }
}

