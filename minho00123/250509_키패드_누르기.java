class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftLocation = -1;
        int rightLocation = -1;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                leftLocation = numbers[i];
            } else if (numbers[i] == 3|| numbers[i] == 6|| numbers[i] == 9) {
                answer += "R";
                rightLocation = numbers[i];
            } else {
                int leftDiff = 0;
                int rightDiff = 0;

                if (numbers[i] == 2) {
                    if (leftLocation == 1 || leftLocation == 5) {
                        leftDiff = 1;
                    } else if (leftLocation == 4 || leftLocation == 8) {
                        leftDiff = 2;
                    } else if (leftLocation == 7 || leftLocation == 0) {
                        leftDiff = 3;
                    } else if (leftLocation == -1) {
                        leftDiff = 4;
                    }
                    
                    if (rightLocation == 3 || rightLocation == 5) {
                        rightDiff = 1;
                    } else if (rightLocation == 6 || rightLocation == 8) {
                        rightDiff = 2;
                    } else if (rightLocation == 9 || rightLocation == 0) {
                        rightDiff = 3;
                    } else if (rightLocation == -1) {
                        rightDiff = 4;
                    }
                } else if (numbers[i] == 5) {
                    if (leftLocation == 2 || leftLocation == 4 || leftLocation == 8) {
                        leftDiff = 1;
                    } else if (leftLocation == 1 || leftLocation == 7 || leftLocation == 0) {
                        leftDiff = 2;
                    } else if (leftLocation == -1) {
                        leftDiff = 3;
                    }
                    
                    if (rightLocation == 2 || rightLocation == 6 || rightLocation == 8) {
                        rightDiff = 1;
                    } else if (rightLocation == 3 || rightLocation == 9 || rightLocation == 0) {
                        rightDiff = 2;
                    } else if (rightLocation == -1) {
                        rightDiff = 3;
                    }
                } else if (numbers[i] == 8) {
                    if (leftLocation == 5 || leftLocation == 7 || leftLocation == 0) {
                        leftDiff = 1;
                    } else if (leftLocation == 2 || leftLocation == 4 || leftLocation == -1) {
                        leftDiff = 2;
                    } else if (leftLocation == 1) {
                        leftDiff = 3;
                    }
                    
                    if (rightLocation == 5 || rightLocation == 9 || rightLocation == 0) {
                        rightDiff = 1;
                    } else if (rightLocation == 6 || rightLocation == 2 || rightLocation == -1) {
                        rightDiff = 2;
                    } else if (rightLocation == 3) {
                        rightDiff = 3;
                    }
                } else if (numbers[i] == 0) {
                    if (leftLocation == 8 || leftLocation == -1) {
                        leftDiff = 1;
                    } else if (leftLocation == 5 || leftLocation == 7) {
                        leftDiff = 2;
                    } else if (leftLocation == 2 || leftLocation ==  4) {
                        leftDiff = 3;
                    } else if (leftLocation == 1) {
                        leftDiff = 4;
                    }
                    
                    if (rightLocation == 8 || rightLocation == -1) {
                        rightDiff = 1;
                    } else if (rightLocation == 5 || rightLocation == 9) {
                        rightDiff = 2;
                    } else if (rightLocation == 2 || rightLocation == 6) {
                        rightDiff = 3;
                    } else if (rightLocation == 3) {
                        rightDiff = 4;
                    }
                }

                if (leftDiff < rightDiff) {
                    answer += "L";
                    leftLocation = numbers[i];
                } else if (leftDiff > rightDiff) {
                    answer += "R";
                    rightLocation = numbers[i];
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        leftLocation = numbers[i];
                    } else {
                        answer += "R";
                        rightLocation = numbers[i];
                    }
                }
            }
        }
        
        return answer;
    }
}

