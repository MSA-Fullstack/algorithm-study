class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int totalSec = 60*Integer.parseInt(video_len.substring(0,video_len.indexOf(':')))+Integer.parseInt(video_len.substring(video_len.indexOf(':')+1));
        int now = 60*Integer.parseInt(pos.substring(0,pos.indexOf(':')))+Integer.parseInt(pos.substring(pos.indexOf(':')+1));
        int opSt = 60*Integer.parseInt(op_start.substring(0,op_start.indexOf(':')))+Integer.parseInt(op_start.substring(op_start.indexOf(':')+1));
        int opEn= 60*Integer.parseInt(op_end.substring(0,op_end.indexOf(':')))+Integer.parseInt(op_end.substring(op_end.indexOf(':')+1));
        if(opSt<=now&&now<=opEn) now=opEn;
        for(int i=0;i<commands.length;i++){
            if(commands[i].equals("next")){
                now+=10;
            }else if(commands[i].equals("prev")){
                now-=10;
            }
            
            if(now<0) now = 0;
            if(totalSec<now) now = totalSec;
            if(opSt<=now&&now<=opEn) now=opEn;
        }
        int min = now/60;
        int sec = now%60;
        StringBuilder sb = new StringBuilder();
        if(min<10) sb.append("0");
        sb.append(min); sb.append(":");
        if(sec<10)sb.append("0");
        sb.append(sec);
        
        answer=sb.toString();
        return answer;
    }
}
