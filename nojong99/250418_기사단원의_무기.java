class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;                
        int[] cnts = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                cnts[j]++;
            }
        }
        for(int i=1; i<=number; i++){
            if(cnts[i]>limit){
                answer+=power;
            }else{
                answer+=cnts[i];
            } 
        }     
        return answer;
    }
}

