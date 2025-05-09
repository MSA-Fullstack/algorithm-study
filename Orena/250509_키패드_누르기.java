import java.lang.*;
import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keypad={{1,2,3},{4,5,6},{7,8,9},{-1,0,-2}};
        Map<Integer, int[]> position = new HashMap<>();
        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad[i].length; j++) {
                position.put(keypad[i][j], new int[]{i, j});
            }
        }
        
        int currentLeft=-1;
        int currentRight=-2;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
                currentLeft=numbers[i];
                answer+="L";
            }
            else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
                currentRight=numbers[i];
                answer+="R";
            }
            else {
                int[] leftPos = position.get(currentLeft);
                int[] rightPos = position.get(currentRight);
                int[] targetPos = position.get(numbers[i]);

                int lDistance = Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]);
                int rDistance = Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]);

                if(lDistance < rDistance) {
                    currentLeft = numbers[i];
                    answer += "L";
                } else if(rDistance < lDistance) {
                    currentRight = numbers[i];
                    answer += "R";
                } else {
                    if(hand.equals("right")){
                        currentRight = numbers[i];
                        answer += "R";
                    } else {
                        currentLeft = numbers[i];
                        answer += "L";
                    }
                }
            }
        }
        return answer;
    }
}
