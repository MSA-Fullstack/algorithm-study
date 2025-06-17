class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        //직사각형의 가로변이 가장 긴 지갑으로 만듦
        for(int i=0; i<sizes.length; i++) {
            int w=sizes[i][0];
            int h=sizes[i][1];
                if(w<h) {
                    //세로가 더 긴 경우 가로가 더 길도록 돌려줌
                    sizes[i][0] = h;
                    sizes[i][1] = w;
                }
        }
        
        int maxw=0;
        int maxh=0;
        
        //가로 중에서 가장 긴 길이를 구함
        for(int i=0; i<sizes.length; i++) {
            if(maxw<sizes[i][0])
                maxw= sizes[i][0];
        }
        
        //세로 중 가장 긴 길이
        for(int i=0; i<sizes.length; i++) {
            if(maxh<sizes[i][1])
                maxh=sizes[i][1];
        }
        
        answer = maxw*maxh;
        
        return answer;
    }
}

