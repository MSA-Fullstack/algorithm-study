class Solution {
    static int answer;
    public int solution(int[] number) {
        boolean[] visited=new boolean[number.length];
        combination(number,visited,0,number.length,3);
        
        return answer;
    }
    //조합 찾기+합이 0이면 answer++하기
    //start 인덱스부터 시작해 n개에서 r개의 조합을 재귀로 계속 찾아내기
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        int sum=0;
        //r이 0이 되면 조합을 다 찾아낸 것이기 때문에 하나씩 불러냄
        if (r == 0) {
            for(int i=0; i<n; i++){
                if(visited[i]) sum+=arr[i];
            }
            if(sum==0) answer++;
            return;
        }
        //현재 인덱스(start부터)가 포함되어 있는 것만 true
        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}
