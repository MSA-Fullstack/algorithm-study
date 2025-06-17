class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int[][] box = new int[(n-1)/w+1][w];
        int totIdx=1;
        for(int row=0; row<box.length; row++){
            if(row%2==0){
                for(int col=0; col<w && totIdx<=n; col++){
                box[row][col]=totIdx;
                totIdx++; 
                }
            }
            else {
                for(int col=w-1; col>=0 && totIdx<=n; col--){
                box[row][col]=totIdx;
                totIdx++; 
                }
            }
        }
        int locR=0;
        int locC=0;
        boolean found=false;
        for(int i=0; i<box.length && !found; i++){
            for(int j=0; j<box[i].length; j++){
                if(box[i][j]==num) {
                    locR=i;
                    locC=j;
                    found=true;
                    break;
                }
            }
        }
        for(int i=locR; i<box.length; i++){
            if(box[i][locC]!=0){
                answer++;
            }
        }
        
        return answer;
    }
}
