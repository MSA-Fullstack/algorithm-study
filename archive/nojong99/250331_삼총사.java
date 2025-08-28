import java.util.Stack;
class Solution {
	public static int solution(int[] number) {
		
		
		int answer = 0;
		Stack<Integer> stk = new Stack<>();
		
		for (int i = 0; i < number.length; i++) {
			stk.add(number[i]);
		} 
		while(true) {
			int num = stk.peek();
			stk.pop();
			for(int i =stk.size()-1; i>=0; i--) {
				for(int j=i-1; j>=0; j--) {
					if(num+stk.get(i)+stk.get(j)==0) {
						answer++;
					}
				}
			}
			if(stk.size()==0) break;
		}
		return answer;
	}
}


