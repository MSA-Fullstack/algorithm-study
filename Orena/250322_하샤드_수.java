class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String s=Integer.toString(x);
		String[] arr=s.split("");
		int sum=0;
        
		for(int i=0; i<arr.length; i++) {
			sum+=Integer.parseInt(arr[i]);
		}
        
		if(x%sum==0)answer=true;
		else answer=false;
        
        return answer;
    }
}

