import java.util.Arrays;

class Solution {
		public int[] solution(int[] arr, int divisor) {
			int[] division = new int[arr.length];
			int idx = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % divisor == 0) {
					division[idx] = arr[i];
					idx++;
				}
			}
			if(idx==0) {
				return new int[] {-1};
			}
            int[] answer = new int[idx];
			for (int i=0; i<idx; i++) {
				answer[i] = division[i];
			}
			Arrays.sort(answer);

			return answer;

		}

	}
    
