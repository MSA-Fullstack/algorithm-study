public class Solution {
    public static boolean isPrime(int num) {
        for (int i = 2; i*i <= num; i++) {
            if (num==1||num % i == 0) return false;
        }
        return true;
    }

    public static int solution(int[] nums) {
        int count = 0; 
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k]; 
                    if (isPrime(sum)) { 
                        count++; 
                    }
                }
            }
        }

        return count; 
    }
}
