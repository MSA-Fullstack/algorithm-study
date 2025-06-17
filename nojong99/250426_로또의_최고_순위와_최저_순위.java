class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count =0;
        int cnt=0;
        int total=0;
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(win_nums[i]==(lottos[j])){
                count++;
            }             
                }
            if(lottos[i]==0){
                
                cnt++;
            } 
            
        }
        total=count+cnt;
        if(total==6){
            answer[0]=1;
        }else if(total==5){
            answer[0]=2;
        }else if(total==4){
            answer[0]=3;
        }else if(total==3){
            answer[0]=4;
        }else if(total==2){
            answer[0]=5;
        }else{
            answer[0]=6;
        }
        
        
        
        if(count==6){
            answer[1]=1;
        }else if(count==5){
            answer[1]=2;
        }else if(count==4){
            answer[1]=3;
        }else if(count==3){
            answer[1]=4;
        }else if(count==2){
            answer[1]=5;
        }else{
            answer[1]=6;
        }
        
        return answer;
    }
}


