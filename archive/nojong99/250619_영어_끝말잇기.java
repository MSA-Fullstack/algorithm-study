import java.util.*;
 
class Solution {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        HashSet<String> NewWords = new HashSet<>();
        char word = ' ';
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            if (i > 0) { 
                if (currentWord.charAt(0) != word) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    return answer;  
                }
            }

            if (NewWords.contains(currentWord)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;  
            }

            NewWords.add(currentWord);

            word = currentWord.charAt(currentWord.length() - 1);
        }

        return answer;
    }
}

