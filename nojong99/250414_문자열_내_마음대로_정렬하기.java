import java.util.*;
class Solution {
	public static String[] solution(String[] strings, int n) {
		
        String[] answer = new String[strings.length];
		ArrayList list = new ArrayList();
		Arrays.sort(strings);
        for (String s : strings) {
			list.add(s.charAt(n));
			list.sort(null);
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int j=0; j<strings.length; j++) {
				if (list.get(i).equals(strings[j].charAt(n))) {
					
                    answer[i] = strings[j];
                    
					strings[j]="                                                                                                                        ";                   
					break;
				}
			}
		}
		return answer;
	}
}

