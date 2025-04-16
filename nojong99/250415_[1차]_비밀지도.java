class Solution {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int j = 0; j < n; j++) {
			String s = "";
			String s1 = "";

			for (int i = 0; i < n; i++) {
				if (arr1[j] % 2 == 1) {
					s += "1";
				} else {
					s += "0";
				}
				arr1[j] = arr1[j] / 2;
				if (arr2[j] % 2 == 1) {
					s1 += "1";
				} else {
					s1 += "0";
				}
				arr2[j] = arr2[j] / 2;
			}

			String a = "";
			 
			for (int k = n - 1; k >= 0; k--) {
				int s2 = (s.charAt(k) - '0') + (s1.charAt(k) - '0');
				if (s2 > 0) {
					a += "#";
				} else {
					a += " ";
				}
			}
			answer[j]="";
			answer[j]+=a;
			
		}
		for(String str : answer) {
			System.out.println(str);
		}
		
		return answer;
	}
}

