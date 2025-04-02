class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0]=-1;
		for(int i=1; i<s.length(); i++) {
			//i번째에 있는 글자가 앞에 있다면
			if((s.substring(0, i)).contains(s.substring(i, i+1))){
				//i번째 index 제외한 마지막 index 찾아서 답 넣기
				int idx=s.lastIndexOf(s.substring(i, i+1),i-1); 
				answer[i]=i-idx;
			}else answer[i]=-1;
		}
        return answer;
    }
}
