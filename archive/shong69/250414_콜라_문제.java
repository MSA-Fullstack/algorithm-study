class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //빈병 a개를 가져다 주면 b개를 줌// n개를 가져다 줬을 때 총 몇 병을 받을 수 있는건지
        //20 / 2 를 계속 함 -> 몫을 계속 더하고, 나머지가 생기는 경우 따로 더해서 마지막에 합해 또 나눔
        //재귀 함수
        int sum = 0;
        while(true){
            sum += (n/a)*b;
            n = (n/a)*b + n%a;
            if(n<a){
                break;
            }
        }
        answer = sum;
        return answer;
    }
}

