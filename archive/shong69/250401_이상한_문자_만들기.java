import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        int idx = 0;
        int cnt = 0;
        while(idx<arr.length){
            if(arr[idx]==' '){
                cnt = 0;
                idx++;
                continue;
            }else if(cnt%2==0){//짝수인 경우
                if(arr[idx]>='a'&& arr[idx]<='z'){
                    arr[idx]-= ('a'-'A');
                }
            }else if(cnt%2==1){//홀수인 경우
                if(arr[idx]>='A'&&arr[idx]<='Z'){
                    arr[idx]+=('a'-'A');
                }
            }
            cnt++;
            idx++;
        
        }
        answer = new String(arr);
        return answer;
    }
}

