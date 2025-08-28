import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int f=0; f<numbers.length-1; f++){
            for(int i=f+1; i<numbers.length; i++) {
                int sum = numbers[f] + numbers[i];
                if(!(ans.contains(sum))) {
                    ans.add(sum);
                }
            }
        }
        
        int[] answer = new int[ans.size()];
        Iterator ite = ans.iterator();
        for(int i=0; i<ans.size(); i++) {
            if(ite.hasNext()) {
                answer[i] = (int)ite.next();
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}

