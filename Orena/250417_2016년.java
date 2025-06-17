class Solution {
    public String solution(int a, int b) {
        int[] month={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int totDay=b-1;
        if(a!=1){
            for(int i=0; i<a-1; i++){
            totDay+=month[i];
            }
        }
        int idx=totDay%7;
        String answer = day[idx];
        return answer;
    }
}
