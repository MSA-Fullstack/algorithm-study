class Solution {
    public String solution(String s) {
        String answer = "";
        int sl=s.length();

        if (sl%2==0) {
            answer = s.substring(sl/2-1,sl/2+1);
        } else {
            answer = s.substring(sl/2,sl/2+1);
                               }
        return answer;
    }
}

