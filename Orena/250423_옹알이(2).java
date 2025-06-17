class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] nephew={"aya", "ye", "woo", "ma"};
        
        for(String word : babbling) {
            //현재 발음 위치, 단어의 idx 위치 정의
            int loc=-1, idx=0, i=0;
            while(i<nephew.length && idx<word.length()){
                for(i=0; i<nephew.length; i++){
                    //단어의 시작이 발음할 수 있는 네 가지 단어와 같은지 확인
                    //같으면 시작점인 idx 이동, 현재 발음 위치도 이동
                    if(loc != i && word.startsWith(nephew[i], idx)) {
                        idx += nephew[i].length();
                        loc = i;
                        break;
                    }
                }
            }
            //마지막까지 이동했으면 발음 가능
            answer += idx==word.length() ? 1 : 0;
        }
        return answer;
    }
}
