class Solution {
	
	    public static int solution(String s) {
	        int answer = 0;
	        int xcnt=0;
	        int cnt=0;
	        String start=s.substring(0,1);
	        for(int i=0; i<s.length(); i++) {
	        	if(start.equals(s.substring(i,i+1))) {
	        		xcnt++;
	        	}else {
	        		cnt++;
	        	}	        	
	        	
	        	if(xcnt==cnt) {
	        		answer++;
	        		xcnt=0;
	        		cnt=0;
	        		if(i+2<=s.length()) {
	        			start=s.substring(i+1,i+2);
	        		}
	        		
	        	}
	        }
	        if(xcnt!=0 || cnt!=0) { //xcnt, cnt가 0이 아닐 남은 수 더하기
	        	answer++;
	        }
	        return answer;
	    }
}

