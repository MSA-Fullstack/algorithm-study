class Solution {
    public int[] solution(int n, String[] words) {
         int[] answer = new int[2];
        int person = 1; 
        int round = 1;
        
        for(int i=1; i<words.length; i++) {
            person = (i % n) + 1;
            round = (i / n) + 1;
            
            char lastChar = words[i-1].charAt(words[i-1].length() - 1);
            char firstChar = words[i].charAt(0);
            
            boolean isDuplicate = false;
            for(int j=0; j<i; j++) {
                if(words[j].equals(words[i])) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if(lastChar != firstChar || isDuplicate) {
                answer[0] = person;
                answer[1] = round;
                return answer;
            }
        }
        
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }
}
