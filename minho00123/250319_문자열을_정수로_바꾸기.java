class Solution {
    public int solution(String s) {
        char[] sArr = s.toCharArray();
        int answer = 0;
        int tenth = 1;
        
        for (int i = sArr.length - 1; i >= 0; i--) {
            if (sArr[i] == '+') {
                continue;
            } else if (sArr[i] == '-') {
                answer *= -1;
            } else {
                answer += (sArr[i] - '0') * tenth;
                tenth *= 10;
            }
        }
        
        return answer;
    }
}

