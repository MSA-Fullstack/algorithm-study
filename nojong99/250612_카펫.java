public class Solution {
    public int[] solution(int brown, int yellow) {
        
        int tot = brown + yellow;
    for (int height = 3; height <= tot / 3; height++) {
        int width = tot/height;
        
        
        if(tot%width==0 && width>=height){
            int cet = (height-2)*(width-2);
	        if(cet==yellow){
	        return new int[]{width,height};
            }   
        }
        
    }
     return null;   
    }   
}

