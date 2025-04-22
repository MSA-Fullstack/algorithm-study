import java.util.ArrayList;

class Solution {
    public static String solution(String[] seoul) {
    	 
    	String answer = "" ;
    	ArrayList<Integer> num = new ArrayList<Integer>();
    for(int i=0; i<seoul.length; i++) {
    	if(seoul[i].equals("Kim")) {
    		num.add(i);
    	}
    		
    }
    if(!num.isEmpty()) {
    	for(int j : num) {
    		answer =(String.format("김서방은 %d에 있다", j));
    	}    	
    }
        return answer;
        
    }
}

