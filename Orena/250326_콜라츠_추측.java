class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num==1) {answer=0;}
	else if(num>1){
		for(int i=0; i<=500; i++) {
			if(num%2==0) {num=num/2;}
			else if(num%2==1&&num!=1) {num=num*3+1;}
			else if(num==1) break;
			answer++;
		}
			
	}
	if(answer>=500) {answer=-1;}
        return answer;
    }
}
