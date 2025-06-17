class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";  
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);       
            for (int j = 0; j < index; j++) {
                ch++;  
                if (ch > 'z') {
                    ch = 'a';  
                }
                while (skip.contains(String.valueOf(ch))) { 
                    //ch를 String타입으로 바꾸고, skip에 포함하는지 확인
                    ch++;
                    if (ch > 'z') {
                        ch = 'a';  
                    }
                }
            }
            answer += ch; 
        }
        return answer;  
    }
}

