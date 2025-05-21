class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int[][] arr = new int[n/w+1][w];
        int x=-1; int y=-1;
        for(int i=1;i<=n;i++){ 
            if((i-1)/w%2==0) arr[(i-1)/w][(i-1)%w]=i;
            if((i-1)/w%2==1) arr[(i-1)/w][w-1-(i-1)%w]=i; 
            if(i==num){
                x=(i-1)/w;
                if((i-1)/w%2==0) y=(i-1)%w;
                else y=w-1-(i-1)%w;
            }
        }
        for(int i=x;i<arr.length;i++){
            if(arr[i][y]!=0)answer++;
        }
        return answer;
    }
}

