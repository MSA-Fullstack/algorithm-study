class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n); 
        int temp = n + 1;

        while (true) {
            int cnt2 = Integer.bitCount(temp); 
            if (cnt == cnt2) {
                answer = temp;
                break;
            }
            temp++;
        }
        return answer;
    }
}
