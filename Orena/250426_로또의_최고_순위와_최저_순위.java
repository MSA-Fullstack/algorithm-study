class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] count = new int[2];
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                count[0]+=1;
                count[1]+=0;
            }else {
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i]==win_nums[j]) {
                        count[0]+=1;
                        count[1]+=1;
                        break;
                    }
                }
            }
        }
        for(int i=0; i<count.length; i++){
            switch(count[i]){
                case 6: answer[i]=1; break;
                case 5: answer[i]=2; break;
                case 4: answer[i]=3; break;
                case 3: answer[i]=4; break;
                case 2: answer[i]=5; break;
                default: answer[i]=6; break;
            }
        }
        
        return answer;
    }
}

