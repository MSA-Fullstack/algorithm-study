import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int p=0;
        //최저 가격이 높을수록 비싼 가격을 받을 수 있으므로 오름차순 정렬 후
        Arrays.sort(score);
        //m개대로 자르기
        //오름 차순 정렬시켜놓은 상태이므로 뒤에서부터 m씩 지워서 가장 작은 수 p
        int n = score.length;
        for(int i = n-m ; i >= 0; i -= m) {
            answer += score[i];
            }
        answer = answer*m;
        
        return answer;
    }
}

