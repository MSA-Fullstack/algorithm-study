import java.util.*;

class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> list = new ArrayList<>();
		String[] td = today.split("\\.");
		int[] tdy = new int[td.length];
		for (int i = 0; i < td.length; i++) {
			tdy[i] = Integer.parseInt(td[i]);
		}

		for (int i = 0; i < privacies.length; i++) {
			String[] pv = privacies[i].split(" ");
			String[] date = pv[0].split("\\.");
			String type = pv[1];

			for (int j = 0; j < terms.length; j++) {
				String[] tm = terms[j].split(" ");
				if (tm[0].equals(type)) {
					int year = Integer.parseInt(date[0]);
					int month = Integer.parseInt(date[1]);
					int day = Integer.parseInt(date[2]);

					int termMonth = Integer.parseInt(tm[1]);

					month += termMonth;

					if (month > 12) {
						year += (month - 1) / 12;
						month = (month - 1) % 12 + 1;
					}

					day -= 1;
					if (day == 0) {
						month -= 1;
						day = 28;
						if (month == 0) {
							year -= 1;
							month = 12;
						}
					}
					int[] destroy = new int[3];
					destroy[0] = year;
					destroy[1] = month;
					destroy[2] = day;

					int result = compareDate(tdy, destroy);
					if (result > 0) {
						list.add(i + 1);
					}
				}
			}

		}
		int[] answer = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			answer[k] = list.get(k);
		}
		return answer;

	}

	public static int compareDate(int[] today, int[] destroy) {
		for (int i = 0; i < 3; i++) {
			if (destroy[i] > today[i])
				return -1;
			if (destroy[i] < today[i])
				return 1;
		}
		return 0;
	}
}
