class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
		
	//분,초로 나누기
        int[] lenInt=toInt(video_len);
        int[] posInt=toInt(pos);
        int[] stInt=toInt(op_start);
        int[] endInt=toInt(op_end);
        
        //'초'로 계산해서 오프닝 범위 안인 경우 처리
        int stSec=stInt[0]*60 + stInt[1];
        int edSec=endInt[0]*60 + endInt[1];
        int videoLen=lenInt[0]*60+lenInt[1];
        int curTime=posInt[0]*60+posInt[1];
        if(curTime>= stSec && curTime<=edSec) {
        	curTime=edSec;
        }
        
        for(int i=0; i<commands.length; i++){
            if(commands[i].equals("next")){
                curTime+=10;
                if(curTime>videoLen) curTime = videoLen;
            }
            if(commands[i].equals("prev")){
            	curTime-=10;
            	if(curTime<0) curTime=0;
            }
            if(curTime>= stSec && curTime<=edSec) {
        	    curTime=edSec;
            }
        }
        
        //분,초로 바꾸기
        int min=curTime/60;
        int sec=curTime%60;
        
        answer=String.format("%02d:%02d", min,sec);
        return answer;
    }
    public static int[] toInt(String s){
        String[] sarr=s.split(":");
        return new int[] {Integer.parseInt(sarr[0]),Integer.parseInt(sarr[1])};
    }
}
