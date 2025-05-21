class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int[] info = new int[attacks[attacks.length - 1][0] + 1];
        
        for (int i = 0; i < attacks.length; i++) {
            info[attacks[i][0]] = -attacks[i][1];
        }
        
        int count = 1;
        for (int i = 0; i < info.length; i++) {
           if (info[i] != 0) {
               count = 1;
           } else {
               if (count % bandage[0] == 0) {
                   info[i] += bandage[1] + bandage[2];
               } else {
                   info[i] = bandage[1];
               }
               count++;
           }
        }
        
        for (int i = 0; i < info.length; i++) {
            answer += info[i];
            
            if (answer > health) {
                answer = health;
            } else if (answer <= 0) {
                return -1;
            }
        }

        return answer;
    }
}

