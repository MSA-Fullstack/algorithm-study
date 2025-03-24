class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt1=0, cnt2=0;
        String[] str=s.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].contains("p")||str[i].contains("P")) {
            	cnt1++;
            }
            if(str[i].contains("y")||str[i].contains("Y")) {
            	cnt2++;
            }
        }
        if(cnt1==cnt2) {answer=true;}
        else {answer=false;}
        

        return answer;
    }
}
