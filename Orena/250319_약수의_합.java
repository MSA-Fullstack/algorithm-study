class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr=new int[n];
        for(int i=1;i<=n; i++) {
            if(n%i==0) arr[i-1]=i;
        }
        for(int j=0; j<arr.length; j++) {
            if(arr[j]!=0)answer+=arr[j];
        }
        
        return answer;
    }
}
