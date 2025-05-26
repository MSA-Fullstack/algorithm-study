class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int change = 0;
        int zeros = 0;
        
        while (!s.equals("1")) {
            String temp = "";
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    temp += "1";
                }
            }
            
            zeros += s.length() - temp.length();
            change++;
            s = Integer.toBinaryString(temp.length());
        }
        
        answer[0] = change;
        answer[1] = zeros;
        
        return answer;
    }
}

