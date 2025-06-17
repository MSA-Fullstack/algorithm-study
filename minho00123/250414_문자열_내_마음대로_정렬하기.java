import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        
        char[] chars = new char[strings.length];
        
        for (int i = 0; i < strings.length; i++) {
            chars[i] = strings[i].charAt(n);
        }
        
        Arrays.sort(chars);
        
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (!strings[j].equals("-1") && chars[i] == strings[j].charAt(n)) {
                    answer[i] = strings[j];
                    strings[j] = "-1";
                    break;
                }
            }
        }

        return answer;
    }
}

