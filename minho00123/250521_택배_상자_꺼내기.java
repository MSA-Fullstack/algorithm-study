class Solution {
    public int solution(int n, int w, int num) {
        if (n == num) {
            return 1;
        } else if (n <= w) {
            return 1;
        }
        
        int answer = 0;
        int boxFloor = n % w > 0 ? n / w + 1 : n / w;
        int numFloor = num % w > 0 ? num / w + 1 : num / w;
        answer = boxFloor - numFloor + 1;

        if (boxFloor % 2 == numFloor % 2) {
            if (n % w == 0 || n % w >= num % w) {
                answer = answer;
            } else if (n % w < num % w) {
                answer--;
            }
        } else {
            if (num % w == 0 || (w - n % w) == w || w - n % w <= num % w) {
                answer = answer;
            } else {
                answer--;
            }
        }
        
        return answer;
    }
}

