
class Solution {
    public int[] solution(long n) {
        
        String n1=n+"";
        int[] answer = {};
        for(int i=n1.length(); i>0; i-- ) {
        	answer[n1.length()-i]=n1.charAt(i)-'0';
        }
        
        return answer;
    }
}

