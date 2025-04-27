class Solution {
    public int solution(String s) {
        int answer=0;
		int sameNum =1;
        int differentNum=0;
        Character x=s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(x.equals(s.charAt(i))) {
                sameNum++;
            } else {
            	differentNum++;
            }
            if(sameNum==differentNum) {
                if(i+1<s.length()) {
	                x=s.charAt(i+1);
                }
                sameNum=0;
                differentNum=0;
                answer++;
            }
        }
        if(sameNum!=0 || differentNum != 0) answer++;
        return answer;
    }
}
