class Solution {
	public int solution(int left, int right) {
		int answer = 0;
		int cnt = 0;
		int[] arr = new int[right - left + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = left;
			left++;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					cnt++;
				}
			}
			if (cnt % 2 == 0) {
				answer = answer + arr[i];
				cnt = 0;
			} else {
				answer = answer - arr[i];
				cnt = 0;
			}
		}
		return answer;
	}
}
