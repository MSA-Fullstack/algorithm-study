import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10;
        int right = 12;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                answer.append("L");
                left = numbers[i];
                continue;
            }else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                answer.append("R");
                right=numbers[i];
                continue;
            }
            if(numbers[i]==0) numbers[i]=11;
            int lLength = Math.abs(left-numbers[i])/3+Math.abs(left-numbers[i])%3;
            int rLength = Math.abs(right-numbers[i])/3+Math.abs(right-numbers[i])%3;
            if(lLength>rLength){
                right = numbers[i];
                answer.append("R");
            }else if(lLength==rLength){
                if(hand.equals("right")){
                    right = numbers[i];
                    answer.append("R");
                }else{
                    left = numbers[i];
                    answer.append("L");
                }
            }else{
                left = numbers[i];
                answer.append("L");
            }
        }
        return answer.toString();
    }
}

