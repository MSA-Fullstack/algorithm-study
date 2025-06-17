import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        
        for(int i=0; i<lost.length; i++){
            lostList.add(lost[i]);
        }
        for(int i=0; i<reserve.length; i++){
            reserveList.add(reserve[i]);
        }
        //여벌도 있고 도난도 당했을 때 두 list에서 모두 지움
        for(int i=0; i<reserveList.size(); ){
            int student = reserveList.get(i);
            if(lostList.contains(student)){
                lostList.remove((Integer)student);
                reserveList.remove(i);
            } else {
                i++;
            }
        }
        
        for(int i=0; i<reserveList.size(); i++){
            int r=reserveList.get(i);
            if(lostList.contains(r-1)){
                lostList.remove((Integer)(r-1));
            } else if(lostList.contains(r+1)){
                lostList.remove((Integer)(r+1));
            }
        }
        
        answer=n-lostList.size();
        return answer;
    }
}

