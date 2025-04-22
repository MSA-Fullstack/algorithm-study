class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int i = 0;
        int dist = 0;
        while(i<section.length){
            dist = section[i]+m-1;
            answer++;
            while(i<section.length&&section[i]<=dist){
                i++;
            }
        }
        return answer;
    }
}

