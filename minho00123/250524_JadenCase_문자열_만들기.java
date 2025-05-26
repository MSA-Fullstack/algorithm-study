class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isSpace = true;
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            
            if (letter == ' ') {
                isSpace = true;
                answer += " ";
            } else {
                if (letter >= 'a' && letter <= 'z' && isSpace) {
                    answer += (char) (letter - ('a' - 'A'));
                    isSpace = false;
                } else {
                    answer += letter;
                    isSpace = false;
                }
            }
        }

        return answer;
    }
}

