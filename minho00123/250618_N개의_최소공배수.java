class Solution {
    public int solution(int[] arr) {
        int num = 1;
        while (true) {
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (num % arr[i] != 0) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                return num;
            }
            
            num++;
        }
    }
}

