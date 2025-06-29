class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for(int i=1;i<=citations.length;i++){
            int cnt=0;
            for(Integer num:citations){
                if(num>=i) cnt++;
            }
            if(cnt>=i) answer=i; 
        }
        return answer;
    }
}
