import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        //bill의 작은 값이 wallet의 작은 값보다 크거나 bill의 큰 값보다 크면 접어야 함
        int x = Math.max(wallet[0],wallet[1]);
        int y = Math.min(wallet[0],wallet[1]);
        int billX = bill[0];
        int billY = bill[1];
        while(true){
            int fold = Math.max(billX,billY);
            int unfold = Math.min(billX,billY);
            if(unfold>y || fold>x){
                billX = fold/2;
                billY = unfold;
                answer++;
            }else if(unfold<=y&&fold<=x){
                break;
            }
        }
        return answer;
    }
}
