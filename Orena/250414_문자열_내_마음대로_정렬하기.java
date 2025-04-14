import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer= new String[strings.length];
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char ch1 = s1.charAt(n);
                char ch2 = s2.charAt(n);
                
                if(ch1<ch2) {
                    return -1;
                } else if(ch1>ch2) {
                    return 1;
                }else {
                    return s1.compareTo(s2);
                }
            }
        });
		answer=strings;
        return answer;
    }
}
