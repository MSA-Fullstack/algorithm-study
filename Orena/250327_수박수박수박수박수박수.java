import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        List<String> list=new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(i%2==0) list.add(i, "수");
            else list.add(i,"박");
        }
        answer=String.join("",list);
       
        return answer;
    }
}

