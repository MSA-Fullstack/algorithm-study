import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer= new int[s.length()];
        //글자 내 모든 문자를 돌아야함
        for(int i=0; i<s.length(); i++) {
            String temp = "";
            temp = s.replaceAll(String.valueOf(s.charAt(i)), "");
            
        //해당 문자에 중복 문자가 없으면 길이는 한글자만 빠지는 것이므로
            if(i != 0 && temp.length() < s.length()-1) {
                int cnt=0;
                //'나'를 기준으로 더 앞에 있는 애들, 한 칸씩 앞으로 전진해서 찾아봄
                for(int j=i-1; j>=0; j--) {
                    if(j==0&&s.charAt(i) != s.charAt(j)) {
                        answer[i] = -1;
                    } else if(s.charAt(i) != s.charAt(j)) {
                        cnt++;
                    } else if(s.charAt(i) == s.charAt(j)) {
                        cnt++;
                        answer[i] = cnt;
                        break;
                    }
                }
                
            } else answer[i] = -1;  
        }
        
        return answer;
    }
}

