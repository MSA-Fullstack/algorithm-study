import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int cnt = 0;
        int zeroCnt = 0;
        while(!s.equals("1")){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0')zeroCnt++;
            }
            s=s.replaceAll("0","");
            int c= s.length();
            s=Integer.toBinaryString(c);
            cnt++;
        }
        answer = new int[2];
        answer[0] = cnt; answer[1]=zeroCnt;
        return answer;
    }
}
