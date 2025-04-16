import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++) {
			for(int j=0; j<name.length; j++) {
				if(Arrays.asList(photo[i]).contains(name[j])) {
					answer[i]+=yearning[j];
				}
			}
		}
        return answer;
    }
}

