class Solution {
	static boolean solution(String s) {
		boolean answer = true;
		
		int numP = 0;
		int numY = 0;

		for (int i = 0; i < s.length() ; i++) {
			if (s.toLowerCase().substring(i, i + 1).equals("p")) {
				numP += 1;
			}
		}
		
		for (int i = 0; i < s.length() ; i++) {
			if (s.toLowerCase().substring(i, i + 1).equals("y")) {
				numY += 1;
			}
		}

		if(numP!=numY) {
			answer=false;
		}
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		
		System.out.println(answer);
		return answer;
	}
}

