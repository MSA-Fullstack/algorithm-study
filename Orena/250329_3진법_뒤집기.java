class Solution {
    public int solution(int n) {
        int answer = 0;
        int len=n;
        int cnt=0;
        //배열에 넣기 위해 배열 길이 구하기
        while(len>0) {
        	len=len/3;
        	cnt++;
        }
        //3진법 배열에 넣기(반전 순서)
        int[] arr=new int[cnt];
        for(int i=0; i<arr.length; i++) {
        	arr[i]=n%3;
        	n=n/3;
        }
        //10진법으로 표현
        int m=arr.length-1;
        for(int i=0; i<arr.length; i++) {
        	answer+=arr[i]*Math.pow(3, m);
        	m--;
        }
        
        return answer;
    }
}
