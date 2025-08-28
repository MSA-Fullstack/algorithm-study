class Solution {
    public static String solution(String s) {
    	String answer = "";
    	String[] spl = s.split(" ", -1);
    	for(int i =0; i<spl.length; i++) {
    		for(int j=0; j<spl[i].length(); j++) {
    			if(j%2==0) {
    				answer+= String.valueOf(spl[i].charAt(j)).toUpperCase();
    			}else {
    				answer+=String.valueOf(spl[i].charAt(j)).toLowerCase();
    			}
    		}if(i!=spl.length-1)answer+=" ";
    	}
    	
        return answer;
    }
}

