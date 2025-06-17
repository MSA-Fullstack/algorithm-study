class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' ') answer += c;

            else if(Character.isLowerCase(c)) {
                    if(c+n > 'z') {
                    answer += (char)(c-('z'-'a'+1)+n);
                    } else if(c+n<='z') answer += (char)(c+n);
            }
            else if(Character.isUpperCase(c)) {
                    if(c+n > 'Z') {
                    answer += (char)(c-('Z'-'A'+1)+n);
                    } else if(c+n<='Z') answer += (char)(c+n);
            }            
            
        }
        
        return answer;
    }
}

