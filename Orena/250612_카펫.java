class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer=new int[2];
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int yellowWidth = yellow / i;
                int yellowHeight = i; 
                
                int w = yellowWidth + 2;
                int h = yellowHeight + 2;
                
                int brownCount = w * h - yellow;
                
                if (brownCount == brown) {
                    answer[0]=w;
                    answer[1]=h;
                }
            }
        }
        return answer;
    }
}
