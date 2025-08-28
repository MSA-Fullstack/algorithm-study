class Solution {
    public int solution(String[][] board, int h, int w) {

        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1}; // 오위아왼
        int bLength = board.length;
        int matchColor= 0;
        
        for(int i = 0; i<4;i++){
            
            int h_check = h+dh[i];
            int w_check = w+dw[i];
            
            if(h_check>=0 && h_check<bLength && w_check>=0 && w_check<bLength){
                if(board[h][w].equals(board[h_check][w_check])){
                matchColor++;
                }
            }

        }
        
        return matchColor;
    }
}

