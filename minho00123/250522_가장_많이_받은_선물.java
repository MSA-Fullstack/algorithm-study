class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int friendsLength = friends.length;
        int[][] indexTable = new int[friendsLength][friendsLength];
        int[][] counts = new int[friendsLength][3];
        int[] giftCounts = new int[friendsLength];
        
        for (int i = 0; i < gifts.length; i++) {
            String[] names = gifts[i].split(" ");
            String giver = names[0];
            String receiver = names[1];
            int giverIndex = -1;
            int receiverIndex = -1;
            
            for (int j = 0; j < friendsLength; j++) {
                if (friends[j].equals(giver)) {
                    giverIndex = j;
                }
                
                if (friends[j].equals(receiver)) {
                    receiverIndex = j;
                }
                
                if (giverIndex != -1 && receiverIndex != -1) {
                    break;
                }
            }
            
            indexTable[giverIndex][receiverIndex]++;
            counts[giverIndex][0]++;
            counts[receiverIndex][1]++;
        }
        
        for (int i = 0; i < counts.length; i++) {
            counts[i][2] = counts[i][0] - counts[i][1];
        }
        
        for (int i = 0; i < indexTable.length; i++) {
            for (int j = i + 1; j < indexTable.length; j++) {
                if (i == j) {
                    continue;
                }
                
                if (indexTable[i][j] > indexTable[j][i]) {
                    giftCounts[i]++;
                } else if (indexTable[i][j] < indexTable[j][i]) {
                     giftCounts[j]++;
                } else {
                    if (indexTable[i][j] == indexTable[j][i]) {
                        if (counts[i][2] > counts[j][2]) {
                            giftCounts[i]++;
                        } else if (counts[i][2] < counts[j][2]){
                            giftCounts[j]++;
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < giftCounts.length; i++) {
            if (giftCounts[i] > answer) {
                answer = giftCounts[i];
            }
        }
        
        return answer;
    }
}

