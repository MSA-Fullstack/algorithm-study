class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // System.out.println(p.length());
        //부분 수열 중 특정 수보다 작거나 같은 수 반환
        for(int i = 0;i<t.length()-p.length()+1;i++){
            if(Long.parseLong(t.substring(i,i+p.length()))-Long.parseLong(p)<=0){
                answer++;
            }
        }
        return answer;
    }
}