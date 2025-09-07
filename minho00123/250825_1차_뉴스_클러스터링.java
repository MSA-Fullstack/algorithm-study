import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        String upperStr1 = str1.toUpperCase();
        String upperStr2 = str2.toUpperCase();
        
        List<String> multiset1 = new ArrayList<>();
        List<String> multiset2 = new ArrayList<>();
        
        getMultiset(upperStr1, multiset1);
        getMultiset(upperStr2, multiset2);
        
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();
        
        int i = 0;
        while (i < multiset1.size()) {
            String set1 = multiset1.get(i);
            boolean isMatched = false;
            for (int j = 0; j < multiset2.size(); j++) {
                String set2 = multiset2.get(j);
                if (set1.equals(set2)) {
                    intersection.add(set1);
                    union.add(set1);
                    multiset1.remove(i);
                    multiset2.remove(j);
                    isMatched = true;
                    break;
                }
            }
            
            if (!isMatched) {
                i++;
            }
        } 
        
        int intersectionSize = intersection.size();
        int unionSize = union.size() + multiset1.size() + multiset2.size();
        double similarity = (unionSize == 0) ? 1.0 : intersectionSize / (double) unionSize;

        return (int) (similarity * 65536);
    }
    
    private void getMultiset(String str, List<String> multiset) {
        for (int i = 0; i < str.length() - 1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);
            if ((ch1 >= 65 && ch1 <= 90) && (ch2 >= 65 && ch2 <= 90)) {
                multiset.add(str.substring(i, i + 2));
            }
        }
    }
}

