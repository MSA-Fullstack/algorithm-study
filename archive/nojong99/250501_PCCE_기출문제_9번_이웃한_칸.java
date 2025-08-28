class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String me =  board[h][w];
        //상
        if(h>0){
            String up=board[h-1][w];
            if(me.equals(up)){
                answer++;
            }
        }
        // 하
        if(h < board.length - 1){
            String down = board[h+1][w];
            if(me.equals(down)){
                answer++;
            }
        }
        // 좌
        if(w>0){
            String lef=board[h][w-1];
            if(me.equals(lef)){
                answer++;
            }
        }
        // 우
        if(w<board.length-1){
            String rht = board[h][w+1];
            if(me.equals(rht)){
                answer++;
            }
        }
         
        return answer;
    }
}


