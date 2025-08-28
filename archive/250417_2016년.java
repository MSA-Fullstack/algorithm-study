class Solution {
    public String solution(int a, int b) {
        int total=0;
        String[] days={"FRI","SAT","SUN", "MON", "TUE", "WED","THU"};
        int[] date={0,31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=1; i<a; i++) {
            total += date[i];
        }
        total += b-1;
        
        return days[total%7];
    }
}

