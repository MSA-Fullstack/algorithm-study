class Solution {
    public long solution(long n) {
        long answer = 0;
        return answer;
    }
    
    
    public static void main(String[] args) {
		int n=118372;
		String n1=n+"";
		int tense=10;
		int answer=0;
		int[] arr= new int[n1.length()];
		for(int i=0; i<n1.length(); i++) {
			arr[i]=Integer.parseInt(n1.substring(i,i+1));
			
		}
		Arrays.sort(arr);
		
		for(int i=n1.length()-1; i>=0; i--) {
			System.out.print(arr[i]);
			
		}
	}
}

