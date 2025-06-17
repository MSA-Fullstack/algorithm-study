import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //바구니는 stack으로 쌓임
        //쌓을 때마다 같은 수가 연속으로 쌓이면 사라진다
        //moves에서 y의 위치를 찾고 그 중 값이 가작 작은 자연수를 찾는다
        //시간복잡도 100*30
        Stack<Integer> stack = new Stack<>();
        for(Integer j:moves){
            for(int i=0;i<board.length;i++){
                if(board[i][j-1]>0){
                    stack.push(board[i][j-1]);
                    board[i][j-1]=0;
                    if(stack.size()>=2){
                        int a = stack.pop();
                        int b = stack.pop();
                        if(a!=b){
                            stack.push(b);
                            stack.push(a);
                        }else{
                            answer+=2;
                        }
                    }
                    break;
                }
                
            }
        }
        return answer;
    }
}

