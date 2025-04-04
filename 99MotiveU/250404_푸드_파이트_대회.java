class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                left.append(i);
            }
        }
        
        String right = left.reverse().toString();
        answer = left.reverse().toString() + "0" + right;
        return answer;
    }
}
