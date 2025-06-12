class Solution {
    public int solution(int n) {
        int answer = n + 1;
        String binary = Integer.toBinaryString(n);
        binary = binary.replace("0", "");
        int ones = binary.length();

        while (true) {
            String binary2 = Integer.toBinaryString(answer);
            binary2 = binary2.replace("0", "");
            int ones2 = binary2.length(); 
            
            if (ones == ones2) {
                break;
            }
            
            answer++;
        }

        return answer;
    }
}

