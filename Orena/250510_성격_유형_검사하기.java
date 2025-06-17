import java.lang.*;
import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        //R T C F J M A N
        Map<String, Integer> ch = new HashMap<>();
        String[] cha = {"R","T","C","F","J","M","A","N"};
        for(int i=0; i<cha.length; i++){
            ch.put(cha[i], 0);
        }
        for(int i=0; i<survey.length; i++){
            if(choices[i]==4) continue;
            if(choices[i]==1 || choices[i]==2 || choices[i]==3) {
                String key=survey[i].substring(0,1);
                if(choices[i]==1){
                    ch.replace(key, ch.get(key)+3);
                }
                if(choices[i]==2){
                    ch.replace(key, ch.get(key)+2);
                }
                if(choices[i]==3){
                    ch.replace(key, ch.get(key)+1);
                }
            }
            if(choices[i]==5 || choices[i]==6 || choices[i]==7) {
                String key=survey[i].substring(1,2);
                if(choices[i]==7){
                    ch.replace(key, ch.get(key)+3);
                }
                if(choices[i]==6){
                    ch.replace(key, ch.get(key)+2);
                }
                if(choices[i]==5){
                    ch.replace(key, ch.get(key)+1);
                }
            }
        }
        //R T C F J M A N
        if(ch.get("R")>ch.get("T")) answer+="R";
        else if(ch.get("R")==ch.get("T")) answer+="R";
        else answer+="T";
        if(ch.get("C")>ch.get("F")) answer+="C";
        else if(ch.get("C")==ch.get("F")) answer+="C";
        else answer+="F";
        if(ch.get("J")>ch.get("M")) answer+="J";
        else if(ch.get("J")==ch.get("M")) answer+="J";
        else answer+="M";
        if(ch.get("A")>ch.get("N")) answer+="A";
        else if(ch.get("A")==ch.get("N")) answer+="A";
        else answer+="N";
            
        return answer;
    }
}
