class Solution {
	public static boolean solution(int x) {
		boolean answer = true;

		String x1 = x + "";
		int a = 0;
		for (int i = 0; i < x1.length(); i++) {

			a += x1.charAt(i) - '0';
		}

		if (x % (a) == 0) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}
}
