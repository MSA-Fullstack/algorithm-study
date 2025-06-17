class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i==0) {
                if(arr[i]>='a'&&arr[i]<='z')arr[i]= (char)(arr[i]-'a'+'A');
            }else if(arr[i-1]==' '&&arr[i]>='a'&&arr[i]<='z'){
                arr[i]= (char)(arr[i]-'a'+'A');
            }else if(arr[i-1]!=' '&&arr[i]>='A'&&arr[i]<='Z'){
                arr[i] = (char)(arr[i]-('A'-'a'));
            }
        }
        answer = new String(arr);
        return answer;
    }
}
