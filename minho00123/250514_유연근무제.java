class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            boolean isOkay = true;
            int tempDay = startday;
            for (int j = 0; j < 7; j++) {
                if (tempDay % 7 != 6 && tempDay % 7 != 0) {
                    int minutes = (schedules[i] % 100) + 10;
                    int realTime = schedules[i] - (schedules[i] % 100);
                    
                    if (minutes > 59) {
                        realTime += 100 + (minutes - 60);
                    } else {
                        realTime += minutes;
                    }

                    if (realTime < timelogs[i][j]) {
                        isOkay = false;
                        break;
                    }
                }
                
                tempDay++;
            }
            
            if (isOkay) {
                answer++;
            }
        }
        
        return answer;
    }
}

