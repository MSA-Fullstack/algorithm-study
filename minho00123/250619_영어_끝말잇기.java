class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            boolean isDuplicated = checkDuplication(i, words[i], words);
            
            if (isDuplicated) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
    
    public boolean checkDuplication(int index, String word, String[] words) {
        for (int i = 0; i < index; i++) {
            if (words[i].equals(word)) {
                return true;
            }
        }
        
        return false;
    }
}

