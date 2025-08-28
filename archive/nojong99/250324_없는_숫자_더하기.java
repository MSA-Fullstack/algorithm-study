class Solution {
	public static int solution(int[] numbers) {
		int answer = -1;
		int sum=0;
		for(int i : numbers) {
			sum+=i;
		}
		answer=45-sum;
		return answer;
	}
}

