class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i=0; i<targets.length; i++){
            int cnt=0;
            boolean find=true;
            char[] target=targets[i].toCharArray();
            for(int j=0; j<target.length; j++){
                //target 최대 index로 초기화
                int taIdx=100;
                for (String keymap1 : keymap) {
                    //keymap에서 문자 위치 찾아서 최소 인덱스로 업데이트
                    int keyIdx=keymap1.indexOf(String.valueOf(target[j]));
                    if (keyIdx != -1){
                        taIdx = Math.min(taIdx, keyIdx+1);
                    } 
                }
                //없으면 false, 있으면 index 더하기
                if(taIdx == 100) {
                    find=false;
                    break;
                } else {
                    cnt += taIdx;
                }
            }
            answer[i]= find? cnt : -1;
        }
        return answer;
    }
}
