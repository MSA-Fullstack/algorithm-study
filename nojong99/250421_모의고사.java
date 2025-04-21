import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public static int[] solution(int[] answers) {
		int[] answer = new int[3];
		int[] s1 = { 1, 2, 3, 4, 5 };
		int[] s2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] s3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		for (int i = 0; i < answers.length; i++) {

			if (answers[i] == s1[i % (s1.length)]) {
				answer[0]++;
			}
			if (answers[i] == s2[i % (s2.length)]) {
				answer[1]++;
			}
			if (answers[i] == s3[i % (s3.length)]) {
				answer[2]++;
			}
		}
		ArrayList lst = new ArrayList();
		for (int j = 0; j < 3; j++) {
			if (Math.max(answer[0], Math.max(answer[1], answer[2])) == answer[j]) {
				lst.add(j+1);
			}
		}
		int[] ans = new int[lst.size()];
		for(int k=0; k<lst.size(); k++) {
			ans[k]=(int) lst.get(k);
		}
		
		Arrays.sort(ans);
		
		return ans;
	}
}
