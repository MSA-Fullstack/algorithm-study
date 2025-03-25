import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s="";
        String str = Long.toString(n);
        long[] arr= new long[str.length()];
        for(int i=0; i<str.length(); i++) {
            arr[i]=str.charAt(i)-'0';
        }
        for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					long temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
        for(int i=0; i<arr.length; i++) {
        	s+=arr[i];
        }
        answer=Long.parseLong(s);
        return answer;
    }
}
