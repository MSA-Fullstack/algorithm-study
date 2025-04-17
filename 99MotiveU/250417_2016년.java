class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] mod = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totaldays = 0;
        for(int i = 0; i < a-1; i++){
            totaldays += mod[i];
        }
        totaldays += b-1;
        answer = days[totaldays %7];
        return answer;
    }
}
