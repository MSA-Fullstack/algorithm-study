class Solution {
    public int solution(int n) {
        int answer = 0;
        //에라토스테네스의 체 방법 사용
        int[] arr=new int[n+1];
        for (int i = 2; i*i < n+1; i++) {
            for (int j = i*i; j < n+1; j = j+i) {
                if (arr[j] == 0) {
                    arr[j] = 1;
                }
            }
        }
        for (int i = 2; i < n+1; i++) {
            if (arr[i] == 0) {
                answer+=1;
            }
        }
        return answer;
     }
}
