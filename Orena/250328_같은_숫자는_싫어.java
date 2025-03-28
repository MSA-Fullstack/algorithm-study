import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int cnt=0;
        List<Integer> list=new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1]==arr[i]) continue;
            else list.add(arr[i]); cnt++;
        }
        int[] answer=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i).intValue();
        }

        return answer;
    }
}

