class Solution {
    public int solution(String s) {
        int answer = 0;
        int countX = 0;
        int countOther = 0;
        char x = ' ';
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (countX == 0) {
                x = c;
                countX = 1;
                countOther = 0;
            } else {
                if (c == x) {
                    countX++;
                } else {
                    countOther++;
                }
            }
            
            if (countX == countOther) {
                answer++;
                countX = 0;
                countOther = 0;
            }
        }
        if (countX != 0 || countOther != 0){
                answer++;
            }
        
        return answer;
    }
}
