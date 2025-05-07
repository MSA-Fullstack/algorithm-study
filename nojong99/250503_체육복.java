import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        // 여벌이 있는데 도난 당함
        for (int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        
        for (int i = 0; i < lost.length; i++) {
	    //처리됐으면 건너뛰기
            if (lost[i] == -1) continue;
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == -1) continue;
                if (lost[i] ==reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    cnt++;
	            //여벌 사용처리
                    reserve[j] = -1;   
                    break;
                }
            }
        }
        
        int realLost = 0;
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] != -1) realLost++; // 체육수업을 못 듣는 학생 수
        }

        return n - (realLost - cnt);
         
    }
}

