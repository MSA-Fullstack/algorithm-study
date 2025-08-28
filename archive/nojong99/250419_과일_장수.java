import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int len = score.length/m; 
        for(int i =0; i<len; i++){             
            k = score[score.length-m*(i+1)];        
            answer+=k*m;
        }        
        return answer;
    }
}

