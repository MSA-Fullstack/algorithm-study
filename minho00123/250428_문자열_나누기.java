class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] charArr = s.toCharArray();

        int cnt = 0;
        while (cnt < charArr.length) {
            int same = 0;
            int diff = 0;
            char x = charArr[cnt];
            
            for (int i = cnt; i < charArr.length; i++) {
                if (x == charArr[i]) {
                    same++;
                } else {
                    diff++;
                }
                cnt++;

                if (same == diff) {
                    answer++;
                    cnt = i + 1;
                    break;
                } else if (i == charArr.length - 1 && same != diff) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}

