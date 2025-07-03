class Solution {
    private int answer;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length]; 
        find(dungeons, visited, k, 0); 
        return answer; 
    }

    private void find(int[][] dungeons, boolean[] visited, int fatigue, int count) {
        answer = Math.max(answer, count);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || fatigue < dungeons[i][0]) {
                continue;
            }
            
            visited[i] = true;
            find(dungeons, visited, fatigue - dungeons[i][1], count + 1);
            visited[i] = false; 
        }
    }
}
