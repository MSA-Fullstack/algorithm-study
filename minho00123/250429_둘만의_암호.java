class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        boolean[] skipArr = new boolean[26];
        
        for (int i = 0; i < skip.length(); i++) {
            skipArr[skip.charAt(i) - 'a'] = true;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int plusNum = index;
            char ch = s.charAt(i);
            int count = 0;
            int startNum = ch - 'a';
            
            while (count < plusNum) {
                if (skipArr[++startNum % 26]) {
                    plusNum++;
                }
                count++;
            }
            
            answer += (char) (((s.charAt(i) - 'a' + plusNum) % 26) + 'a');
        }
        
        return answer;
    }
}

