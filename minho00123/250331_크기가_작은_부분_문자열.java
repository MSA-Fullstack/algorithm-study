class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long number = Long.valueOf(t.substring(i, i + p.length()));
            
            if (number <= Long.valueOf(p)) {
                answer++;
            }
        }

        return answer;
    }
}

