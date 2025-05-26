class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int rmCnt=0;
        int cnt=0;
        while(!s.equals("1")){
            int zeros = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                }
            }
            rmCnt += zeros;
            s = s.replace("0", ""); 
            s=Integer.toBinaryString(s.length());
            cnt++;
        }
        answer[0]=cnt;
        answer[1]=rmCnt;
        return answer;
    }
}
