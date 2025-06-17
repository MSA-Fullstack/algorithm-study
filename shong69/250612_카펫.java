class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow; //전체 넓이
        for(int wid = 1;wid<total;wid++){
            if(total%wid!=0) continue;
            
            int hgh = total/wid;
            if((wid - 2)*(hgh - 2) == yellow && wid >=hgh){
                return new int[]{wid,hgh};
            }
        }
        return null;
    }
}

