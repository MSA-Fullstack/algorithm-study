class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] startPoint = new int[2];
        char[][] map = new char[park.length][park[0].length()];
        
        for (int i = 0; i < park.length; i++) {
            char[] chs = park[i].toCharArray();
            for (int j = 0; j < chs.length; j++) {
                map[i][j] = chs[j];
                if (chs[j] == 'S') {
                    startPoint[0] = i;
                    startPoint[1] = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            String op = route[0];
            int n = Integer.parseInt(route[1]);
            boolean isBlocked = false;

            if (op.equals("N") && (startPoint[0] - n) >= 0) {
                for (int j = startPoint[0]; j >= startPoint[0] - n; j--) {
                    if (map[j][startPoint[1]] == 'X') {
                        isBlocked = true;
                        break;
                    }
                }
                
                if (!isBlocked) {
                    startPoint[0] -= n;
                }
            } else if (op.equals("S") && (startPoint[0] + n) < map.length) {
                for (int j = startPoint[0]; j <= startPoint[0] + n; j++) {
                    if (map[j][startPoint[1]] == 'X') {
                        isBlocked = true;
                        break;
                    }
                }
                
                if (!isBlocked) {
                    startPoint[0] += n;
                }
            } else if (op.equals("W") && (startPoint[1] - n) >= 0) {
                for (int j = startPoint[1]; j >= startPoint[1] - n; j--) {
                    if (map[startPoint[0]][j] == 'X') {
                        isBlocked = true;
                        break;
                    }
                }
                
                if (!isBlocked) {
                    startPoint[1] -= n;
                }
            } else if (op.equals("E") && (startPoint[1] + n) < map[0].length) {
                for (int j = startPoint[1]; j <= startPoint[1] + n; j++) {
                    if (map[startPoint[0]][j] == 'X') {
                        isBlocked = true;
                        break;
                    }
                }
                
                if (!isBlocked) {
                    startPoint[1] += n;
                }
            } 
        }

        return startPoint;
    }
}

