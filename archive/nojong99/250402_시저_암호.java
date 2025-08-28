class Solution {
	public static String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i)+n>'z' && s.charAt(i)!=' '){
                answer+=((char)('a'+s.charAt(i)+n-'z'-1));
            }
            else if(s.charAt(i)==' '){
            	answer+=' ';
            }
            else if(s.charAt(i)<='Z' && s.charAt(i)+n>'Z') {
            	answer+=((char)('A'+s.charAt(i)+n-'Z'-1));
            }
            else {
            	answer+=(char)(s.charAt(i)+n);
            }
            
        }
        return answer;
    }
}


