import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        int cnt = lost.length;
        for(Integer i:reserve) {
            list.add(i);
        }
        Arrays.sort(lost);
        for(int i=0;i<lost.length;i++){
            if(list.contains(lost[i])){
                list.remove(Integer.valueOf(lost[i]));
                cnt--;
                lost[i]=0;
            }
        }
        
        for(Integer i:lost){
            if(i==0){
                continue;
            }
            if(i==1){
                if(list.contains(2)){
                    list.remove(Integer.valueOf(2));
                    cnt--;
                }
            }else{                
                if(list.contains(i-1)){
                    list.remove(Integer.valueOf(i-1));
                    cnt--;
                }else if(list.contains(i+1)){
                    list.remove(Integer.valueOf(i+1));
                    cnt--;
                }
            }
        }
        answer = n-cnt;
        return answer;
    }
}

