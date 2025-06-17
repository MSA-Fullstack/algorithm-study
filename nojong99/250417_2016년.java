class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] m = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int cnt=b-1;
        for(int i=0; i<a-1; i++){
            cnt+=m[i];
        }
        int day = (cnt%7);
        answer=week[day];
        return answer;
    }
}


