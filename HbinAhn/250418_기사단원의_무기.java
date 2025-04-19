class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
     
        for(int i=1; i<number+1; i++) {
            int divisior=0;
            for(int j=1; j*j <= i; j++) {
                    if(i%j==0) {
                        if(j*j==i) {
                            divisior++;
                        }else divisior += 2;
                    }
                }
            if(divisior>limit){
                answer += power;
            }else answer += divisior;
        }
     
        return answer;
    }
}

