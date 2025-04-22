import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        //오름차순으로 정렬
        Arrays.sort(d);
        //budget에서 원소를 빼가며 <0이면 스탑, cnt의 최고값을 리턴한다.
        for(int i=0;i<d.length;i++){
            if(budget - d[i] >=0){
                budget-=d[i];
                answer++;
            }else{
                break;
            }

        }
        
        return answer;
    }
}

