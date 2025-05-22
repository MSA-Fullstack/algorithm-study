import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int n = friends.length;
        int[][] arr=new int[n+1][n+1];
        List<String> list=new ArrayList<>(Arrays.asList(friends));
        
        // 선물 횟수 기록
        for(String gift: gifts){
            String[] gi = gift.split(" ");
            int giveIdx = list.indexOf(gi[0]) + 1;
            int takeIdx = list.indexOf(gi[1]) + 1;
            arr[giveIdx][takeIdx]++;
        }
        
        int[] giveSum = new int[n+1]; // 준 선물 수
        int[] takeSum = new int[n+1]; // 받은 선물 수
        
        // 선물 지수 계산
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                giveSum[i] += arr[i][j];
                takeSum[i] += arr[j][i];
            }
        }
        
        int[] friend = new int[n];
        
        for(int i=1; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                if(arr[i][j] > arr[j][i]){
                    friend[i-1]++;
                } else if(arr[i][j] < arr[j][i]){
                    friend[j-1]++;
                } else {
                    int iScore = giveSum[i] - takeSum[i];
                    int jScore = giveSum[j] - takeSum[j];
                    if(iScore > jScore){
                        friend[i-1]++;
                    } else if(jScore > iScore){
                        friend[j-1]++;
                    }
                    // 같으면 아무 행동 안 함
                }
            }
        }
        answer = Arrays.stream(friend).max().getAsInt();
        return answer;
    }
}
