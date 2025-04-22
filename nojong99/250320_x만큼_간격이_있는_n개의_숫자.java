import java.util.Scanner;

class Solution{
	 
	 public static long[] solution(long x, int n){
		 long[] answer=new long[n];
		 for(int i=0; i<n; i++) {
			 answer[i]= (x*(i+1));	
		 }
		 
		 
		 return answer;
	 }
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 long x = sc.nextLong();
		 int n = sc.nextInt();
		System.out.println(solution(x, n));
	}
	 
	  
 }


