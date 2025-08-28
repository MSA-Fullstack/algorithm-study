import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        //가장 가까운 곳이 얼마나 떨어져있는지
        answer= new int[s.length()];
        answer[0]=-1;
        for(int i = 1;i<s.length();i++){
            String str = s.substring(0,i);
            if(str.lastIndexOf(s.charAt(i))>=0){
                answer[i]=i-str.lastIndexOf(s.charAt(i));
            }else{
                answer[i]=-1;
            }
        }
        return answer;
    }
}

