class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr=s.split("");
        int idx=0;
        for(String ss : sArr){
            //" "이 있으면 다시 홀짝 판단해야 함
            if(ss.contains(" ")) {
                idx=0;
            }
            else idx++;
            //idx가 홀수면 문자열에서 짝수번째
            if(idx%2==0) answer+=ss.toLowerCase();
            else answer+=ss.toUpperCase();
            
        }
        
        return answer;
    }
}
