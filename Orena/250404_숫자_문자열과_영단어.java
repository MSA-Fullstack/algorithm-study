class Solution {
    public int solution(String s) {
        String[][] sArr= {{"zero","0"},{"one","1"},{"two","2"}
			,{"three","3"},{"four","4"},{"five","5"},{"six","6"}
			,{"seven","7"},{"eight","8"},{"nine","9"}}; 
		for(int i=0; i<sArr.length; i++) {
			if(s.contains(sArr[i][0])) {
				s=s.replace(sArr[i][0], sArr[i][1]);
			}
		}
        int answer = Integer.valueOf(s);
        
        return answer;
    }
}
