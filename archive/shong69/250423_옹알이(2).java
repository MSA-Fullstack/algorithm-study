import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        //단어는 최대 100개 주어질 수 있고, 길이는 최대 30개 -> 10번 반복
        for(int i=0;i<babbling.length;i++){
            if(isTrue(babbling[i]))answer++;
        }
        return answer;
    }
    public boolean isTrue(String word){
        String[] arr = {"aya","ye","woo","ma"};
        String preW = "";
        int idx = 0;
        while(word.length()>idx){
            boolean isTrue = false;
            for(int i=0;i<arr.length;i++){
                if(arr[i].length()<=word.length()-idx) {
                    String sub = word.substring(idx,idx+arr[i].length());
                    
                    if(sub.equals(arr[i])){
                        if(sub.equals(preW)){
                            return false;
                        }
                        
                        idx += arr[i].length();
                        isTrue = true;
                        preW = sub;
                        break;
                    }
                    
                }


            }
            if(!isTrue) return false;
        }
        
        return true;
    }
}

