import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int count = 0;
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int index = commands[i][2] - 1;
            int[] slicedArray = Arrays.copyOfRange(array, start, end);

            Arrays.sort(slicedArray);
            answer[count++] =slicedArray[index];
        }
        
        return answer;
    }
}

