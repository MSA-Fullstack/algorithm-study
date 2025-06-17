class Solution {
    public int solution(int n) {
        int answer = 0;
        int cntN = 0;
        char[] arr = (Integer.toBinaryString(n)).toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1')cntN++;
        }
    
        int num = n+1;
        while(true){
            char[] arr2 = (Integer.toBinaryString(num)).toCharArray();
            int cntNum=0;
            for(int i=0;i<arr2.length;i++){
                if(arr2[i]=='1')cntNum++;
            }
            if(cntNum==cntN) {
                answer = num;
                break;
            }
            num++;
        }
        return answer;
    }
}
