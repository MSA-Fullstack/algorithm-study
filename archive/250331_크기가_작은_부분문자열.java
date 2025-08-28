class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        int size = t.length() - len + 1;

        long[] ans = new long[size]; 

        for (int i = 0; i < size; i++) {
            String sub = t.substring(i, i + len);
            ans[i] = Long.parseLong(sub); 
        }

        long p1 = Long.parseLong(p);

        for (int i = 0; i < size; i++) {
            if (ans[i] <= p1) answer++;
        }

        return answer;
    }
}

