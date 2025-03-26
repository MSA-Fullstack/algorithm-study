class Solution {
    public int solution(int num) {
        int count = 0;
        
        if (num == 1) {
            return 0;
        }
        
        while (count <= 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            
            count++;
            
            if (num == 1) {
                return count;
            }
        }
        
        return -1;
    }
}

