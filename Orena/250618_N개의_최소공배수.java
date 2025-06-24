class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        long result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = (result * arr[i]) / gcd(result, arr[i]);
        }
        answer=(int)result;
        return answer;
    }
    
    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

