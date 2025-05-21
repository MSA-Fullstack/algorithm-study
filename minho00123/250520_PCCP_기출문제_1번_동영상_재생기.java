class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int videoLenSeconds = changeToSeconds(video_len);
        int posSeconds = changeToSeconds(pos);
        int opStartSeconds = changeToSeconds(op_start);
        int opEndSeconds = changeToSeconds(op_end);

        if (posSeconds >= opStartSeconds && posSeconds <= opEndSeconds) {
            posSeconds = opEndSeconds;
        } 
        
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                posSeconds += 10;
            } else if (commands[i].equals("prev")) {
                posSeconds -= 10;
            }
            
            if (posSeconds <= 0) {
                posSeconds = 0;
            } else if (posSeconds >= videoLenSeconds) {
                posSeconds = videoLenSeconds;
            }

            if (posSeconds >= opStartSeconds && posSeconds <= opEndSeconds) {
                posSeconds = opEndSeconds;
            }
        }
        
        int min = posSeconds / 60;
        int sec = posSeconds % 60;
        
        if (min < 10) {
            answer += "0" + min + ":";
        } else {
            answer += min + ":";
        }
        
        if (sec < 10) {
            answer += "0" + sec;
        } else {
            answer += sec;
        }

        return answer;
    }
    
    public int changeToSeconds(String time) {
        String[] splittedTime = time.split(":");
        int min = Integer.parseInt(splittedTime[0]);
        int sec = Integer.parseInt(splittedTime[1]);
        
        return min * 60 + sec;
    }
}

