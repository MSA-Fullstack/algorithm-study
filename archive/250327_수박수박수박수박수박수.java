import java.util.Arrays;

class Solution {
    public String solution(int n) {
        String answer = "";
        String[] word = new String [n];
        
        for (int i = 0; i< n; i++) {
            if(i==0||i%2==0) word [i] = "수";
            else word [i] = "박";
            };
        
        return String.join("", word);
    }
}

