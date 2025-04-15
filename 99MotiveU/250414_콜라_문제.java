class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int exchanged = n / a;	 // 교환
            int get = exchanged * b;	 // 새 병
            answer += get;		 // 총 병
            n = (n % a) + get;		 // 남은 병 
        }
        return answer;
    }
}
