class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        //배열의 모든 수를 더한 후 45에서 빼기
        int sum = 45;
        for(Integer num:numbers){
            sum -= num;
        }
        answer = sum;
        return answer;
    }
}

