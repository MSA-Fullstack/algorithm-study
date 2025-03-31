import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int temp = arr[0];
        int cnt =0;
        for(int i =1;i<arr.length;i++){
            if(temp==arr[i]){
                arr[i]=-1;
                cnt++;
            }else{
                temp = arr[i];
            }
        }
        //배열 복사하기
        answer = new int[arr.length-cnt];
        int idx = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=-1){
                answer[idx++]=arr[i];
            }
        }
        return answer;
    }
}



