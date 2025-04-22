class Solution {
    public int solution(int n, int m, int[] section) {
        if (m == 1) {
            return section.length;
        }
        
        int answer = 1;
        int startIndex = 0;
        int lastIndex = 1;
        while (true) {
            if (lastIndex != section.length) {
                if (section[lastIndex] - section[startIndex] + 1 > m) {
                    answer++;
                    startIndex = lastIndex;
                    lastIndex++;
                } else {
                    lastIndex++;
                }
            } else {
                break;
            }
        }

        return answer;
    }
}

