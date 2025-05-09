class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        boolean[] hasClothesList = new boolean[n];

        for (int i = 0; i < n; i++) {
            hasClothesList[i] = true;
        }

        for (int i = 0; i < lost.length; i++) {
            hasClothesList[lost[i] - 1] = false;
        }
        
        for (int i = 0; i < reserve.length; i++) {
            if (!hasClothesList[reserve[i] - 1]) {
                hasClothesList[reserve[i] - 1] = true;
                reserve[i] = 0;
            }
        }
        
        for (int i = 0; i < reserve.length; i++) {
            int before = reserve[i] - 2;
            int after = reserve[i];
            
            if (reserve[i] != 0) {
                if (before < 0) {
                    if (!hasClothesList[after]) {
                        hasClothesList[after] = true;
                    }
                } else if (after >= n) {
                    if (!hasClothesList[before]) {
                        hasClothesList[before] = true;
                    }
                } else {
                    if (!hasClothesList[before]) {
                        hasClothesList[before] = true;
                    } else if (!hasClothesList[after]) {
                        hasClothesList[after] = true;
                    }
                }
            }
        }
        
        for (int i = 0; i < hasClothesList.length; i++) {
            if (hasClothesList[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}

