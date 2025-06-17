class Solution {
	public static int solution(int[][] sizes) {
        int answer = 0;
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        int ans=0;

        for(int i =0; i<sizes.length; i++) {
        	width[i]=  Math.max(sizes[i][0], sizes[i][1]);
        	height[i]= Math.min(sizes[i][0], sizes[i][1]);
        }
        
        for(int wid: width) {
        	ans=Math.max(ans, wid);
        }
        for(int hei: height) {
        	answer=Math.max(answer,hei);
        }
        answer=ans*answer;
        return answer;
    }
}


