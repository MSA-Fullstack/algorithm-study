class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long l=x;
        for(int i=0; i<answer.length; i++){
            answer[i]=l;
            l+=x;
            
        }
        return answer;
    }
}
