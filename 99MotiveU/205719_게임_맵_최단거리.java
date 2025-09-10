import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;

        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1}); // (x, y, 거리)
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], dist = cur[2];

            if (x == n - 1 && y == m - 1) {
                answer = dist;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny, dist + 1});
                    }
                }
            }
        }

        if (answer == 0) answer = -1;

        return answer;
    }
}
