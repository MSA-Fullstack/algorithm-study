import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        //두 수에 공통으로 나타나는 수로 만들 수 있는 가장 큰 수 구하기(없으면 -1)
        List<Character> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(Character i:Y.toCharArray()){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        for(Character ch : X.toCharArray()){
            if(map.containsKey(ch)&&map.get(ch)>0){
                list.add(ch);
                map.put(ch,map.get(ch)-1);
            }
        }
        if(list.size()==0)return "-1";
        Collections.sort(list,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(Character i:list){
            sb.append(i);
        }
        answer = sb.toString();
        if (answer.replaceAll("0", "").equals("")) {
            answer = "0";
        }
        return answer;
    }
}

