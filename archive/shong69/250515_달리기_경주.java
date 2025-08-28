import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {}; //정답이 담긴 문자열 배열
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        
        for(int i=0;i<callings.length;i++){
            int order=map.get(callings[i]); //순서
            String player=players[order]; //선수이름
            map.put(player,order-1);
            map.put(players[order-1],map.get(players[order-1])+1);
            
            players[order] = players[order-1];
            players[order-1] = player;
        }
        
        answer=players;
        return answer;
    }
}

