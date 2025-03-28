public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int idx=0;
        int cnt=1;
        
        //중복 값들을 -1로 바꾸는 for문
        for(int i=1; i<arr.length; i++) {
            if(arr[i]==arr[idx]) {
                arr[i] = -1;
                
            }else {
                idx = i;
                cnt++; 
            }
        }
      //중복되지 않는 수의 길이
        answer= new int[cnt];
        
        idx=0;
    //answer에 중복값이 없는 원소만 넣는 for문 
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>=0) {
                answer[idx] = arr[i];
                idx++;
            }
        }

        return answer;
    }
}

