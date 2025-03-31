class Solution {
    public String getReversedTernary(int n) {
        String ternary = "";
        
        while (n > 0) {
            ternary += n % 3;
            n /= 3;
        }
        
        return ternary;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        String reversedTernary = getReversedTernary(n);
        
        for (int i = 0; i < reversedTernary.length(); i++) {
            answer += (reversedTernary.charAt(i) - '0') * Math.pow(3, reversedTernary.length() - i - 1);
        }

        return answer;
    }
}

