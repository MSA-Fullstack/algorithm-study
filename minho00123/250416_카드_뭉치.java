class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int goalIdx = 0;
        int cards1Idx = 0;
        int cards2Idx = 0;
        
        while (true) {
            if (goalIdx == goal.length) {
                break;
            }
            
            String word = goal[goalIdx];
            
            if (cards1Idx < cards1.length && word.equals(cards1[cards1Idx])) {
                goalIdx++;
                cards1Idx++;
            } else if (cards2Idx < cards2.length && word.equals(cards2[cards2Idx])) {
                goalIdx++;
                cards2Idx++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}

