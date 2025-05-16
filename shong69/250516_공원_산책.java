import java.util.*;
class Solution {
    public int x=0, y= 0;
    public int n=0, m=0;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {}; //좌표값 리턴
        n=park.length; m=park[0].length();
        int[] dx = {0,1,0,-1}; //우,하,좌,위
        int[] dy = {1,0,-1,0};
        List<Character> list = new ArrayList<>();
        list.add('E'); list.add('S'); list.add('W'); list.add('N');
        boolean isTrue = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(park[i].charAt(j)=='S'){
                    x=i; y=j; 
                    isTrue = true;
                    break;
                } 
            }
            if(isTrue) break;
        }
        
        for(int i=0;i<routes.length;i++){
            int dir = list.indexOf(routes[i].charAt(0)); //방향
            int dis = routes[i].charAt(2)-'0'; //거리
            int p = x; int k = y;
            boolean pass = true;
            for(int j=0;j<dis;j++){
                int nx = p+dx[dir]; int ny=k+dy[dir];
                if(inRange(nx,ny)&&park[nx].charAt(ny)!='X'){
                    p=nx; k=ny;
                }else{
                    pass = false;
                    break;
                } 
            }
            if(pass){
                x=p;y=k;
            }
        }
        answer = new int[2];
        answer[0] = x; answer[1]=y;
        
        return answer;
    }
    public boolean inRange(int x, int y){
        return (0<=x&&x<n&&0<=y&&y<m);
    }
}

