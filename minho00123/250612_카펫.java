class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for (int i = 3; i <= sum / 2; i++) {
            if (sum % i == 0) {
                int width = i;
                int height = sum / i;
                int outside = width * 2 + height * 2 - 4;
                int inside = sum - outside;
                
                if (brown == outside && yellow == inside) {
                    answer[0] = Math.max(width, height);
                    answer[1] = Math.min(width, height);
                    break;
                }
            }
        }
        
        return answer;
    }
}

