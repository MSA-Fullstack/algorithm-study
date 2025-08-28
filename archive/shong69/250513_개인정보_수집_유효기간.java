import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        //today를 숫자 배열로 바꾸기
        int[] tDate = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();
        int totalTDate = tDate[0]*12*28 + tDate[1]*28 + tDate[2];

        
        //terms를 map으로 바꾸기
        Map<String, String> termMap = new HashMap<>();
        for(String term : terms) {
        	String[] list = term.split(" ");
        	termMap.put(list[0], list[1]); // K : A V: 6...
        }
        
        //비교하기
        int index = 1;
        List<Integer> result = new ArrayList<>();
        for(String privacy : privacies) {
        	String[] list =  privacy.split(" ");
        	int[] pDate = Arrays.stream(list[0].split("\\.")).mapToInt(Integer::parseInt).toArray();

        	int totalPDate = pDate[0]*12*28 + pDate[1]*28 + pDate[2] +
        			Integer.valueOf(termMap.get(list[1]))*28 - 1;
        	
        	if(totalPDate<totalTDate) {
        		result.add(index);
        	}
        	index++;
        }   
        int[] answer = result.stream().mapToInt(Integer :: intValue).toArray();

		return answer;
    }    
}
