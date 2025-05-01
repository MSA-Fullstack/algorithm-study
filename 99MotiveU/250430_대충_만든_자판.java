class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            boolean possible = true;

            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                int minPress = Integer.MAX_VALUE;

                for (int k = 0; k < keymap.length; k++) {
                    int idx = keymap[k].indexOf(c);
                    if (idx != -1) {
                        minPress = Math.min(minPress, idx + 1);
                    }
                }
                
                if (minPress == Integer.MAX_VALUE) {
                    possible = false;
                    break;
                } else {
                    count += minPress;
                }
            }
            answer[i] = possible ? count : -1;
        }  
        return answer;
    }
}
