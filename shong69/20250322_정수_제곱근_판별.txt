class Solution {
    public long solution(long n) {
        long answer = -1;

        if(n == 1){
            answer = 4L;
        }else{
            long num = n/2;
            long temp = n/2;
            
            while(true){
                if(num*num==n){
                    return (num+1)*(num+1);
                }else if(num>n/num){
                    temp = num;
                    num /=2;
                }else{
                    if((num+1)*(num+1)>n){
                        break;
                    }
                    if(num<temp){
                        num++;
                    }
                    
                }
            }

        }
        return answer;
    }
}

