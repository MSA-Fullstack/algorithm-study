class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        
        String temp = "";
        for (int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                temp += ch;
            } else if (ch >= '0' && ch <= '9') {
                temp += ch;
            } else if (ch == '-' || ch == '_' || ch == '.') {
                temp += ch;
            }
        }
        
        answer = temp;
        
        temp = "";
        for (int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            if (i + 1 < answer.length() && ch == '.' && answer.charAt(i + 1) == '.') {
                continue;
            } else {
                temp += ch;
            }
        }
        
        answer = temp;
        
        if (answer.length() <= 1 && answer.startsWith(".")) {
            answer = "";
        } else if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        
        if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        if (answer.length() == 0) {
            answer = "a";
        }
        
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        
        if (answer.length() <= 2) {
            char lastChar = answer.charAt(answer.length() - 1);
            while (answer.length() != 3) {
                answer += lastChar;
            } 
        }
        
        return answer;
    }
}

