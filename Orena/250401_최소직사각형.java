class Solution {
    public int solution(int[][] sizes) {
        int max = 0, min = 0;
		int wmax = 1, hmax = 1;	
		for (int i = 0; i < sizes.length; i++) {
			max = Math.max(sizes[i][0], sizes[i][1]);
			min = Math.min(sizes[i][0], sizes[i][1]);
			if(max>wmax) wmax=max;
			if(min>hmax) hmax=min;
		}
		int answer=wmax*hmax;
        return answer;
    }
}
