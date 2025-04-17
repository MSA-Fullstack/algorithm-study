class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisor=new int[number];
        for(int i=0; i<number; i++){
            for(int j=1; j*j<=i+1; j++){
                if(j*j==i+1) divisor[i]+=1;
                else if((i+1)%j==0) divisor[i]+=2;
            }
            if(divisor[i]<=limit) answer+=divisor[i];
            else answer+=power;
        }
        return answer;
    }
}

