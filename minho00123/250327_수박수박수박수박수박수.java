class Solution {
    public String solution(int n) {
        String answer = "";
        String[] subak = new String[] {"수", "박"};
        
        for (int i = 0; i < n; i++) {
            answer += subak[i%2];
        }

        return answer;
    }
}

