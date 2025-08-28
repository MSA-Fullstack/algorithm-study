import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};

        List<String> list = new ArrayList<>();
        //가장 먼저 탈락하는 사람의 번호와 몇번째 차례인지 return
        boolean pass = true;
        for(String word:words){
            if(list.size()==0){
                list.add(word);
                continue;
            }
            String lastW = list.get(list.size()-1);
            if(list.contains(word)||!lastW.endsWith(String.valueOf(word.charAt(0)))){
                pass=false;
                break;
            }
            list.add(word);
        }
        if(pass){
            answer = new int[] {0,0};
        }else{
            answer=new int[]{list.size()%n+1,list.size()/n+1};
        }
        
        return answer;
    }
}
