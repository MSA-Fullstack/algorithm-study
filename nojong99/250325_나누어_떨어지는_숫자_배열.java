
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList solution(int[] arr, int divisor) {
//    	int[] answer = {};
    	ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i =0; i<arr.length; i++) {
        	if(arr[i]%divisor==0) {
        		
        		answer.add(arr[i]);
        	}
        }
        if(answer.isEmpty()) {
        	answer.add(-1);
        }
        
        answer.sort(null);
        return answer;
    }

