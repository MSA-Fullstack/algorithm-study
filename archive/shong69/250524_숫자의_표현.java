import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                list.add(i);
            }
        }
        for(Integer i:list){
            if(i%2!=0) answer++;
        }
        return answer;
    }
}
