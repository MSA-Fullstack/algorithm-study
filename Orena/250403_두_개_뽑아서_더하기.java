import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set set=new HashSet();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=1; j<numbers.length; j++){
                if(!(i==j)){
                    int sum=numbers[i]+numbers[j];
                    set.add(sum);
                }
            }
        }
        int[] answer = new int[set.size()];
        Iterator note=set.iterator();
        while(note.hasNext()){
            for(int i=0; i<answer.length; i++){
                answer[i]=(Integer)note.next();
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}

