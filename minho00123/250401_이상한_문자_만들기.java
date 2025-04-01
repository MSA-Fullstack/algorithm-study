class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        int index = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                answer += charArray[i];
                index = 0;
            } else if (index % 2 == 0) {
                if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                    answer += (char) (charArray[i] - ('a' - 'A'));
                } else {
                    answer += charArray[i];
                }
                index++;
            } else if (index % 2 == 1) {
                if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                   answer += (char) (charArray[i] + ('a' - 'A'));
                } else {
                    answer += charArray[i];
                }
                index++;
            }
        }
        return answer;
    }
}

