class Solution {
    public int[] solution(int n, long left, long right) {
        int idx=(int)(right-left)+1;
        int[] answer=new int[idx];
        
        for(int i=0; i<idx; i++){
            long position=left+i;
            int row = (int)(position / n);
            int col = (int)(position % n);
            answer[i] = Math.max(row + 1, col + 1);
        }
        
        return answer;
    }
}
