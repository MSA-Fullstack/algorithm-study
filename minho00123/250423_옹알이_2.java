class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] sounds = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            int j = 0;
            int count = 0;
            while (true) {
                if (count == 5) {
                    break;
                }

                if (word.startsWith(sounds[j])) {
                    word = word.replaceFirst(sounds[j], "");
                    if (word.startsWith(sounds[j])) {
                        break;
                    }
                    count = 0;
                } else {
                    j = (j + 1) % 4;
                    count++;
                }
            }
            
            if (word.length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}

