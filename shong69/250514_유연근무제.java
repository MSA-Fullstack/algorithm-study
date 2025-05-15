class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int pass = schedules.length;
        for(int i=0;i<schedules.length;i++){
            int day = startday;
            for(int j=0;j<7;j++){
                if(day>6) {
                    day = 1;
                    continue;
                }else if(day>5){
                    day=7;
                    continue;
                }else{
                    // 950(9:50) 590  / 1000(10:00) 600
                    int hour= timelogs[i][j]/100;
                    int min= timelogs[i][j]%100;
                    
                    if((schedules[i]/100*60)+(schedules[i]%100)+10<hour*60+min){
                        pass--;
                        break;
                    }
                    day++;
                }
            }
        }
        answer= pass;
        return answer;
    }
}
