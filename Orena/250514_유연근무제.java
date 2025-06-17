class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = timelogs.length;
        int[] admit=new int[schedules.length];
        for (int i=0; i<schedules.length; i++){
            int hour=schedules[i]/100;
            int minute=schedules[i]%100+10;
            if(minute>=60) {
                minute-=60;
                hour+=1;
            }
            admit[i]=hour*100+minute;
        }
    
        for(int i=0; i<timelogs.length; i++){
            int start=startday;
            for(int j=0; j<timelogs[i].length; j++){
                if(start>7) start=1;
                if(start<6 && timelogs[i][j]>admit[i]){
                    answer-=1;
                    break;
                }
                start++;
            }
        }
        return answer;
    }
}
