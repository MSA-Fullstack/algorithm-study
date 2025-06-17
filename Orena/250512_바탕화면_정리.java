import java.lang.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int lux=Integer.MAX_VALUE;
        int luy=Integer.MAX_VALUE;
        int rdx=Integer.MIN_VALUE;
        int rdy=Integer.MIN_VALUE;
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    lux=Math.min(i,lux);
                    luy=Math.min(j,luy);
                    rdx=Math.max(i,rdx);
                    rdy=Math.max(j,rdy);
                }
            }
        }
        int[] answer={lux,luy,rdx+1,rdy+1};
        return answer;
    }
}
