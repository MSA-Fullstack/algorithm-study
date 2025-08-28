import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        String[] s=new String[goal.length];
        int n=0;
        int m=0;
        for(int i=0; i<goal.length; i++){               
            if(n<cards1.length){    
                if(goal[i].equals(cards1[n])){
                    s[i]=cards1[n];
                    n++;
                }
            }
            if(m<cards2.length){
                if(goal[i].equals(cards2[m])){
                    s[i]=cards2[m];
                    m++;
                }
            }    
       }
        if(Arrays.equals(s,goal)){
            return "Yes";    
        }else{
            return "No";
        }
        
    }
}


