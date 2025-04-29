class Solution {
    public int solution(String s) {
        int answer = 1;

        char chr = s.charAt(0);
        int chNum = 1;
        int otherNum = 0;
        while(true){
            if(chNum+otherNum>=s.length()){
                break;
            }
            if(chNum==otherNum){
                chr = s.charAt(chNum+otherNum);
                chNum++;
                answer++;
                continue;
            }
            if(chr != s.charAt(chNum+otherNum)){
                otherNum++;
            }else{
                chNum++;
            }
        }
        return answer;
    }
}

