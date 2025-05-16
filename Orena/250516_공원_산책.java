class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int width=park[0].length();
        int height=park.length;
        //좌표 지도 만들기
        int[][] parkMap=new int[width][height];
        //출발 위치 찾기
        for(int i=0; i<park.length; i++){
            if(park[i].contains("S")){
                answer[0]=i;
                answer[1]=park[i].indexOf("S");
            }
        }
        
        for(int i=0; i<routes.length; i++){
            String[] route=routes[i].split(" ");
            String dir = route[0];
            int dist = Integer.parseInt(route[1]);
            int nx = answer[0];
            int ny = answer[1];
            boolean canMove = true;

            // 한칸씩 이동해서 이동 불가능한 경우 false,break
            for(int d=1; d<=dist; d++){
                int tx = answer[0];
                int ty = answer[1];

                if(dir.equals("E"))      ty += d;
                else if(dir.equals("W")) ty -= d;
                else if(dir.equals("S")) tx += d;
                else if(dir.equals("N")) tx -= d;

                if(tx < 0 || tx >= height || ty < 0 || ty >= width || park[tx].charAt(ty) == 'X'){
                    canMove = false;
                    break;
                }
            }

            // true일 때만 좌표 갱신
            if(canMove){
                if(dir.equals("E"))      answer[1] += dist;
                else if(dir.equals("W")) answer[1] -= dist;
                else if(dir.equals("S")) answer[0] += dist;
                else if(dir.equals("N")) answer[0] -= dist;
            }
            
        }
        
        return answer;
    }
}
