class Solution {
    public int solution(int num) {
        int answer = 0;
        long n1 = num;
        
        while(n1 > 1) {
            if(n1%2==0) { 
                n1 = n1/2;
            } else {n1 = n1*3+1;}
            answer++;
            if(answer >= 500) return -1;  
        } 
        
        return answer;
        } 
       
}

