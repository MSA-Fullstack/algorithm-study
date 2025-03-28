import java.util.*;

public class Solution {
	public static ArrayList solution(int[] arr) {
		ArrayList answer = new ArrayList();
		Stack stack = new Stack();
		stack.push(arr[0]);
		answer.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (!stack.peek().equals(arr[i])) {
				answer.add(stack.push(arr[i]));
			}
		}
		return answer;
	}
}

