class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int max=health;
        int reTime=0;
        int attackIdx=0;
        
        for(int i=0; i<=attacks[attacks.length-1][0]; i++){
            if(attackIdx<attacks.length && i==attacks[attackIdx][0]){
                reTime=0;
                health-=attacks[attackIdx][1];
                attackIdx++;
                if(health<=0) return -1;
            } else {
                reTime++;
                health+=bandage[1];
                if(reTime==bandage[0]){
                reTime=0;
                health+=bandage[2];
                }
                if(health>max) health=max;
            }
        }
        int answer=health;
        return answer;
    }
}
