import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        while(true){
            if(n<3) {
                list.add(n%3); 
                break;
            }
            list.add(n%3);
            n/=3;

        }
        System.out.print(list.toString());
        int cnt = 0;
        for(int i=list.size()-1;i>=0;i--){
            answer+=list.get(i)*Math.pow(3.0,cnt++);
        }
        return answer;
    }
}





