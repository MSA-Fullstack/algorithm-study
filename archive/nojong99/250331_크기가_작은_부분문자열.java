class Solution {
	public static int solution(String t, String p) {
		int answer = 0;
		for (int i = 0; i < t.length() - p.length() + 1; i++) {
			Long t1 = Long.valueOf(t.substring(i, i + p.length()));
			Long t2 = Long.valueOf(p);
			if (t1 <= t2) {
				answer++;
			}
		}
		return answer;
	}
}

