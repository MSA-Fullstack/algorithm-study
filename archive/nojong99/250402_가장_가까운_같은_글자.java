class Solution {
    public int[] solution(String s) {
  
        int[] answer = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            if(i==0){
                answer[0]=-1;
            }else{
                int cnt=0;
                for(int j=i-1; j>=0; j--){
                    ++cnt;
                    if(s.charAt(i)==s.charAt(j)){
                        answer[i]=cnt;
                        break;
                    }else if(cnt>=i)answer[i]=-1;
                }
            } 
        }      
        return answer;
    }
}

