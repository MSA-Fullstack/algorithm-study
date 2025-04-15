class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];
        //각 원소별 자리수를 or 연산으로 구해서 하나로 합친다 -> true인 위치를 #으로 출력하는 for문
        int[][] arr3 = new int[n][n];
        int[][] arr4 = new int[n][n];
        for(int i = 0;i<n;i++){
            arr3[i]=func(arr1[i],n);
            arr4[i]=func(arr2[i],n);
        }
        char[] arr = new char[n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr3[i][j]+arr4[i][j]>0){
                    arr[j] = '#';
                }else{
                    arr[j]=' ';
                }
            }
            answer[i] = String.valueOf(arr);
        }
        
        
        return answer;
    }
    public int[] func(int num, int n){
        int[] arr = new int[n];
        while(true){
            if(num<2){
                arr[--n] = num;
                break;
            }
            arr[--n] = num%2;
            num/=2;

        }
        return arr;
    }
}

