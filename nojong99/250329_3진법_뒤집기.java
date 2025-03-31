class Solution {
	public static int solution(int n) {
		int answer = 0;
		String str = "";
		while (n > 1) {
			str += (n % 3);
			n /= 3;
		}
		if (n == 1) {
			str += "1";
		}
		answer = Integer.parseInt(str, 3);
		return answer;
	}
}


