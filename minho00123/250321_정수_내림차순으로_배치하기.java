import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String nString = String.valueOf(n);
        String newString= "";
        char[] arr = new char[nString.length()];
        
        for (int i = 0; i < nString.length(); i++) {
            arr[i] = nString.charAt(i);
        }
        
        Arrays.sort(arr);
        
        for (int i = arr.length - 1; i >= 0; i--) {
            newString += arr[i];
        }
        
        return Long.valueOf(newString);
    }
}

