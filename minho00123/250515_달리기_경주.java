import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> raceOrder = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            raceOrder.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int index = raceOrder.get(callings[i]);
            int target = index - 1;
            
            String temp = players[target];
            players[target] = callings[i];
            players[index] = temp;
            
            raceOrder.replace(callings[i], target);
            raceOrder.replace(temp, index);
        }
        
        return players;
    }
}

