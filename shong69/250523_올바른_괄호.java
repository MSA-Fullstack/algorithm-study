class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if(s.charAt(0)==')') return false;
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') cnt++;
            else cnt--;
            if(cnt<0)return false;
        }
        if(cnt!=0) answer = false;
        return answer;
    }
}

