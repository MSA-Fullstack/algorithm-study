class Solution {
    public static String solution(int[] food) {
    	String answer = "0";
    	
    	for(int i =food.length-1; i>0; i--) {
    		if(food[i]>1)
    			for(int j =0; j<food[i]/2; j++) {
    				answer=String.valueOf(i)+answer+String.valueOf(i);
    			}
    	}
        return answer;
    }
}



