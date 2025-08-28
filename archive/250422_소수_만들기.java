import java.util.*;

class Solution {
    //소수 찾기 메서드
    public boolean isPrime(int num){
        if(num==0||num==1) return false;
        
        for(int i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        int n=nums.length;
        int sum=0;
        //nums 하나씩 더하기
        //더한 숫자가 소수인지 검사
        //소수일 경우 answer++;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) answer++;
                } 
            }
        }
        
            return answer; 
    }
        
}

