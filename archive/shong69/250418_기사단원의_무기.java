import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int result = 0;
        for(int i=1;i<=number;i++){
            int divisor = 1;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    divisor++;
                }
            }
            if(divisor >limit){
                result += power; 
            }else{
                result += divisor;
            }
        }
        answer = result;
        return answer;
    }
}

