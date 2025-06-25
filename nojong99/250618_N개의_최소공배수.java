class Solution {
    // 유클리드 호제법 
    private int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1; 
        }
        return getGCD(num2, num1 % num2);
    }

    
    private int getLCM(int num1, int num2) {
        return (num1 * num2) / getGCD(num1, num2); 
    }

    
    public int solution(int[] arr) {
        
        int lcmResult = arr[0];

        for (int i = 1; i < arr.length; i++) {
            lcmResult = getLCM(lcmResult, arr[i]);
        }

        return lcmResult; 
    }
}

