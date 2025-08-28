import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        char[] arr = s.toCharArray();
        //set으로 시간복잡도 O(1) 줄이기 
        Set<Character> set = new HashSet<>();
        for(char c:skip.toCharArray()){
            set.add(c);
        }
        for(char ch:arr){
            int idx = 0;
            while(idx<index){
                ch++;
                if(ch>'z') ch = 'a';
                if(!set.contains(ch)){ //겹치지 않는 경우에만 인정됨
                    idx++;
                } 
            }
            answer.append(ch);
        }
           
        return answer.toString();
    }
}

