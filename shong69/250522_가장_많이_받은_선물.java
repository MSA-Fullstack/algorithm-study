import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int frLength = friends.length;
        //친구 순서 배열 
        Map<String, Integer> friendDic = new HashMap<String, Integer>();
        //선물 지수 배열
        int[] giftDegree = new int[frLength];
        //준사람 받은사람 이중 배열
        int[][] giftGragh = new int[frLength][frLength];
        
        for(int i = 0; i < frLength; i ++){
            friendDic.put(friends[i], i);
        }
        for(int i = 0; i < gifts.length;i++){
            //원소 스플릿 해서 계산하기
            String[] splgift = gifts[i].split(" ");
            
            //1. 지수 계산해서 giftDegree에 넣기
            //준사람에 해당하는 번째에 +1
            giftDegree[friendDic.get(splgift[0])]++;
            //받은 사람에 해당하는 번째에 -1
            giftDegree[friendDic.get(splgift[1])]--;
            //2. 각각 이름에 맞게 giftGragh에 넣기
            giftGragh[friendDic.get(splgift[0])][friendDic.get(splgift[1])]++;
        }
        
        for(int i = 0;i<frLength; i++){
            //행 반복
            int nextMonGift = 0;
            for(int j = 0;j<frLength;j++){
                //열 반복
                if(giftGragh[i][j]>giftGragh[j][i]){
                    //더 많이 받았는지
                    nextMonGift++;
                }
                if(giftGragh[i][j]==giftGragh[j][i] &&
                  giftDegree[i]>giftDegree[j]){
                    //선물 주고받은 개수가 같거나 선물 지수로 비교할 때
                    nextMonGift++;
                }
            }
            
            if(nextMonGift > answer){
                answer = nextMonGift;
            }
        }        
        return answer;
    }
    
}

