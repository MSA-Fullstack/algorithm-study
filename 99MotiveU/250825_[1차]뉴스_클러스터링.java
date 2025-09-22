import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for (int i = 0; i < str1.length()-1; i++) {
            String sub = str1.substring(i, i+2);
            if (sub.matches("[A-Z]{2}")) list1.add(sub);
        }
        for (int i = 0; i < str2.length()-1; i++) {
            String sub = str2.substring(i, i+2);
            if (sub.matches("[A-Z]{2}")) list2.add(sub);
        }
        
        List<String> inter = new ArrayList<>();
        List<String> temp = new ArrayList<>(list2);
        for (String s : list1) {
            if (temp.remove(s)) inter.add(s);
        }
        
        int interSize = inter.size();
        int unionSize = list1.size() + list2.size() - interSize;
        
        if (unionSize == 0) return 65536;
        return (int)((double) interSize / unionSize * 65536);
    }
}
