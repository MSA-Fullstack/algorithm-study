import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> currentLoc = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            currentLoc.put(players[i], i);
        }
        
        for(int i=0; i<callings.length; i++){
            int idx=currentLoc.get(callings[i]);
            String temp=players[idx-1];
            
            players[idx-1]=callings[i];
            players[idx]=temp;
            
            currentLoc.put(callings[i],idx-1);
            currentLoc.put(temp, idx);
        }
        
        return players;
    }
}
