class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int j=0;
        int k=0;
        
            for(int i=0; i<goal.length; i++){
                if(j<cards1.length&&goal[i].equals(cards1[j]))  j++;
                else if(k<cards2.length&&goal[i].equals(cards2[k]) ) k++;
                else return "No";
            }
            answer = "Yes";
        
        return answer;
        }
}

