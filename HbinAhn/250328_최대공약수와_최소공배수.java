class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int max=0;
        
        answer=new int[2];
        //최대공약수
        //n이 큰지, m이 큰지 모르므로 n+m만큼 시도
        for(int i=1; i<n+m; i++) {
            if((n%i==0)&&(m%i==0)) max = i;
        };
        answer[0] = max;
        
        //최소공배수
        answer[1]=(n*m)/max;        
        
        return answer;
    }
}

