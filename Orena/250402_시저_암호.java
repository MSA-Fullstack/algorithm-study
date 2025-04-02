class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr=new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i]=s.charAt(i);
		}
		
		for(int i=0; i<arr.length; i++) {
			//공백인 경우
			if(arr[i]==' ') {
				arr[i]=(char)' ';
			} //a~z 사이인 경우
			else if(arr[i]>='a'&&arr[i]<='z'&&(char)(arr[i]+n)>'z') {
				arr[i]=(char) (arr[i]+n-('z'-'a')-1);
			} //A~Z 사이인 경우
			else if(arr[i]>='A'&&arr[i]<='Z'&&(char)(arr[i]+n)>'Z') {
				arr[i]=(char) (arr[i]+n-('Z'-'A')-1);
			}else {
				arr[i]=(char)(arr[i]+n);
			}
		}
		for(int i=0; i<arr.length; i++) {
			answer+=Character.toString(arr[i]);
		}
        return answer;
    }
}
