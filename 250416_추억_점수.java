class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {}; 
        answer = new int[photo.length]; 
/*
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;

            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];

                for (int k = 0; k < name.length; k++) {
                    if (person.equals(name[k])) {
                        sum += yearning[k];
                        break; 
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
*/
	Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                sum += map.getOrDefault(photo[i][j], 0);
            }
            answer[i] = sum;
        }
        return answer;
    }
}
