class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int max = -1;
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length; j++) {
                int x = 1;
                int y = 1;
                if (park[i][j].equals("-1")) {
                    int k = i + 1;
                    while (k < park.length && park[k][j].equals("-1")) {
                        x++;
                        k++;
                    }
                    
                    k = j + 1;
                    while (k < park[0].length && park[i][k].equals("-1")) {
                        y++;
                        k++;
                    }
                    
                    int temp = Math.min(x, y);
                    
                    for (int m = i; m < i + temp; m++) {
                        for (int n = j; n < j + temp; n++) {
                            if (!park[m][n].equals("-1")) {
                                temp = Math.min(temp, Math.max(m - i, n - j));
                                break;
                            }
                        }
                    }
                    
                    if (max < temp) {
                        max = temp;
                    }
                }
            }
        }

        for (int i = 0; i < mats.length; i++) {
            if (mats[i] <= max && answer < mats[i]) {
                answer = mats[i];
            }
        }
        
        return answer;
    }
}

