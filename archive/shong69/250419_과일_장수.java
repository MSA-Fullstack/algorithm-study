import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //정렬해서 m만큼 잘라서 팔기
        //제일 작은 수 * m 해서 최대 상자 개수만큼 만들어서 총합 리턴하기        
        Arrays.sort(score);
        int n = score.length;
        while(n>=m){
            int[] arr = Arrays.copyOfRange(score,n-m,n+1);
            answer += arr[0]*m;
            n= n-m;
        }
        
        return answer;
    }
}

