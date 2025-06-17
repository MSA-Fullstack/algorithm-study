class Solution {
    public static int solution(String dartResult) {
        int[] score = new int[3]; 
        int index = 0; 

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            
            if (Character.isDigit(ch)) { // 정수 판별
                if (ch == '1' && dartResult.charAt(i + 1) == '0') {
                    score[index] = 10;
                    i++; 
                } else {
                    score[index] = ch - '0'; 
                }
            }
 
            else if (ch == 'S') {
                score[index] = (int) Math.pow(score[index], 1);
                index++;
            } else if (ch == 'D') {
                score[index] = (int) Math.pow(score[index], 2);
                index++;
            } else if (ch == 'T') {
                score[index] = (int) Math.pow(score[index], 3);
                index++;
            }
 
            else if (ch == '*') {
                if (index > 1) { //1보다 크면 
					score[index - 2] *= 2;  
                }
                score[index - 1] *= 2;  
            } else if (ch == '#') {
                score[index - 1] *= -1;  
            }
        }
 
        return score[0] + score[1] + score[2];
    }
 
}

