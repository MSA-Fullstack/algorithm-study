import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        Stack<Character> result = new Stack<>();
        Stack<Integer> options = new Stack<>();
        
        for (int i = 0; i < dartResult.length(); i++) {
            result.push(dartResult.charAt(i));
        }
        
        int powerNumber = 1;
        int score = 0;
        while (!result.empty()) {
            char top = result.pop();
            if (top == 'S') {
                powerNumber = 1;
            } else if (top == 'D') {
                powerNumber = 2;
            } else if (top == 'T') {
                powerNumber = 3;
            } else if (top == '*') {
                if (options.empty()) {
                    options.push(2);
                    options.push(2);
                } else {
                    int temp = options.pop();
                    temp *= 2;
                    if (options.empty()) {
                        options.push(2);
                        options.push(temp);
                    } else {
                        options.push(options.pop() * 2);
                        options.push(temp);
                    }
                }
            } else if (top == '#') {
                if (options.empty()) {
                    options.push(-1);
                } else {
                    options.push(options.pop() * -1);
                }
            }
            
            if (top - '0' >= 0 && top - '0' <= 9) {
                if (top == '0') {
                    if (result.empty()) {
                        score = 0;
                    } else {
                        char nextTop = result.pop();
                        if (nextTop == '1') {
                            score = 10;
                        } else {
                            score = 0;
                            result.push(nextTop);
                        }
                    }
                } else {
                    score = top - '0';
                }

                if (!options.empty()) {
                    int option = options.pop();
                    answer += ((int) Math.pow(score, powerNumber)) * option;
                } else {
                    answer += ((int) Math.pow(score, powerNumber));
                }
                
            }
        }
        
        return answer;
    }
}

