class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        java.util.Arrays.sort(participant);
        java.util.Arrays.sort(completion);
        
        int i = 0;
        while (i < completion.length) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
            
            i++;
        }
        
        if (i == participant.length - 1) {
            answer = participant[participant.length - 1];
        }
        
        return answer;
    }
}

