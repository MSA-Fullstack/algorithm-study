class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //최대공약수(반복문으로 나머지 계속 구하기)
        int a=n;
        int b=m;
        if(a>b) {
            int temp=a%b;
            while(temp>0) {
                a=b;
                b=temp;
                temp=a%b;
            }
            answer[0]=b;
        } else {
            int temp=b%a;
            while(temp>0){
                b=a;
                a=temp;
                temp=b%a;
            }
            answer[0]=a;
        }
        //최소공배수
        answer[1]=n*m/answer[0];
        return answer;
    }
}

