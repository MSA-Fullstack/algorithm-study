class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int x1 =50, x2=-1, y1=50, y2=-1;
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    x1=x1<=i?x1:i;
                    y1=y1<=j?y1:j;

                    x2=x2>=i?x2:i;
                    y2=y2>=j?y2:j; 
                }
            }
        }
        answer = new int[4];
        answer[0]=x1; answer[1]=y1;answer[2]=x2+1;answer[3]=y2+1;
        return answer;
    }
}
