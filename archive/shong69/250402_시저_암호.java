class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!= ' '){
                if(arr[i]+n>'z'){
                    arr[i]= (char)(arr[i]+n-26);
                }else if(arr[i]<='Z'&& arr[i]+n>'Z'){ //대문자인 경우
                    arr[i] = (char)(arr[i]+n-26);
                    
                }else{
                    arr[i]=(char)(arr[i]+n);
                }
            }
        }
        answer = new String(arr);
        return answer;
    }
}


