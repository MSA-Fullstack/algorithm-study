import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        //각 명함마다 더 긴 배열 / 더 작은 배열로 나눈다
        //긴 배열의 값에서 가장 큰 값과 더 작은 배열에서 가장 큰 값을 곱한다
        int maxNo1 = 0;
        int maxNo2 = 0;
        for(int i = 0;i<sizes.length;i++){
            int maxNo = Math.max(sizes[i][0],sizes[i][1]);
            int minNo = Math.min(sizes[i][0],sizes[i][1]);
            
            //큰 값 비교하기
            maxNo1 = Math.max(maxNo1, maxNo);
            maxNo2 = Math.max(maxNo2, minNo);
        }
        answer = maxNo1 * maxNo2;
        
        return answer;
    }
}


