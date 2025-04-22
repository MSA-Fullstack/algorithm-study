import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i=score.length-1; i>=0; i--){
        	int[] box=new int[m];
            for(int j=m-1; j>=0; j--){
                box[j]=score[i];
                if(i<=0 || j==0) break;
                else i--;
            }
            if(box[0]!=0)answer+=box[0]*m;
        }
        return answer;
    }
}
