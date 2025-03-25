class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'p') {
                pCount++;
            } else if (s.toLowerCase().charAt(i) == 'y') {
                yCount++;
            }
        }
        
        return pCount == yCount;
    }
}

