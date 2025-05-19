import java.util.Scanner;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
		int answer = 0;
		int t = bandage[0], x = bandage[1], y = bandage[2];

		int life = health;
		int attackCount = attacks.length-1;
		int skill = 0; //붕대감기 지속시간
		
		for(int sec = 1; sec <= attacks[attackCount][0]; sec++){
			boolean isAttacked = false;
			for(int i = 0; i<=attackCount; i++){
			    if(sec == attacks[i][0]){
			        life -= attacks[i][1]; //공격 데미지 들어감
			        skill = 0;
                    isAttacked = true;
			    } 
			}
	        if(sec == attacks[attackCount][0]){ 
	            answer = life;
	        }
	        if(life <= 0){ 
	        	return -1;
	        }
	        if(!isAttacked) {
			    skill++;
			    life += x; 
			    if(skill == t){
			        //연속 붕대감기 성공한 경우
			        life += y;
			        skill = 0;
			    }
			    if(life>=health) {
			    	//최대 생명력을 넘는 경우
			    	life = health;
			    }
	        }
		}
		return answer;
    }
}
