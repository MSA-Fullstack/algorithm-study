class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i=0; i<targets.length; i++){
            for(int j=0; j<targets[i].length(); j++){
            	String tg = targets[i].substring(j,j+1);	
            	int val = -1;
	            for(int k=0; k<keymap.length; k++) {  
	            	if(keymap[k].indexOf(tg)!=-1){ //k안에 tg가 있다면
	            		if(val ==-1 || keymap[k].indexOf(tg)<val) { 
	            			val=keymap[k].indexOf(tg); // 최소값 
	            		}
	            	}
	            }
	            if(val == -1) { //keymap 안에 tg가 없다면
	            	answer[i]=-1;
	            	break;
	            }
	            else {
	            	answer[i]+=(val+1); // 1부터 시작 
                }	            
            }          
        }        
        return answer;
    }    
}

