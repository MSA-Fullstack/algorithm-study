class Solution {
    String[] voice = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        for(String wr : babbling){  
            if(check(wr,"")){
                answer++;
            }
        }  
        return answer; 
    }
    
    public boolean check(String wr, String prev){
        //wr이 ""이 된 경우 true
        if(wr.isEmpty()) return true;
        for(int i=0; i<voice.length; i++){
                //voice로 시작하는지 && 중복 체크
                if(wr.startsWith(voice[i]) && !voice[i].equals(prev)){
                    // 재귀로 호출해 wr를 voice 이후로 만든 후 prev값을 넘겨주기
                    if(check(wr.substring(voice[i].length()),voice[i])){
                        return true;
                    }         
                }   
            }
        return false;
    }
}

