class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            String[] list = photo[i];
            int score = 0;
            for (int j = 0; j < list.length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if (list[j].equals(name[k])) {
                        score += yearning[k];
                    }
                }
            }
            
            answer[i] = score;
        }
        
        return answer;
    }
}

