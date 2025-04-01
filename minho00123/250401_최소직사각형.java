import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] widths = new int[sizes.length];
        int[] heights = new int[sizes.length];
        int answer = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            widths[i] = Math.max(sizes[i][0], sizes[i][1]);
            heights[i] = Math.min(sizes[i][0], sizes[i][1]);   
        }
        
        Arrays.sort(widths);
        Arrays.sort(heights);
        
        return widths[widths.length - 1] * heights[heights.length - 1];
    }
}

