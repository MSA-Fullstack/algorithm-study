import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        int n=arr.length;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=i) {
                answer=i;
                break;
            }
            else answer=arr.length;
        }
        
        return answer;
    }
}
