class Solution {
    public int solution(String word) {

        int answer = 0;
        int[] weight = {781, 156, 31, 6, 1};
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < word.length(); i++) {
            int idx = 0;

            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    idx = j;
                    break;
                }
            }
            
            answer += idx * weight[i] + 1;
        }
        
        return answer;
    }
}
