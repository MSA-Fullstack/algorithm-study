import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        //가능한 발음의 배열 조합
        //연속해서 같은 발음을 하지 못함
        String[] c={"aya", "ye", "woo", "ma"};
        String[] d={"ayaaya", "yeye", "woowoo", "mama"};
        
        //중복 확인
        for(int i=0; i<babbling.length; i++){
            boolean flag=true;
            for(int j=0; j<d.length; j++){
                if(babbling[i].contains(d[j])) {
                    babbling[i]=babbling[i].replace(d[j], "-");
                    // flag=false;
                }   
            }
            // if(flag){
            for(int k=0; k<c.length; k++) {
                if(babbling[i].contains(c[k])) {
                    babbling[i]= babbling[i].replace(c[k], ".");
    System.out.println(babbling[i]);
                        
                    }
                }
            if(babbling[i].replace(".","").equals("")) {
            answer++;
        
                        }
            }
            // }

        return answer;
    }
}

