class Solution {
    public String solution(String s) {
        String[] sarr=s.split(" ");
        StringBuilder answer = new StringBuilder();
        boolean isStart = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer.append(c);
                isStart = true; 
            } else {
                if (isStart) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                isStart = false;
            }
        }
        return answer.toString();
    }
}
