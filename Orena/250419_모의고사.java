import java.util.*;

class Solution {
    static int stucnt;
	public static void test(int[] answers, int[] stuans){
		for(int i=0; i<answers.length; i++) {
        	for(int j=0; j<stuans.length; j++) {
        		if(answers[i]==stuans[j]) stucnt++;
        		if(i>=answers.length-1|| j==stuans.length-1) break; 
        		else i++;
        	}
        }
	}
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int onecnt=0, twocnt=0, threecnt=0;
        test(answers, one);
        onecnt=stucnt;
        stucnt=0;
        test(answers,two);
        twocnt=stucnt;
        stucnt=0;
        test(answers, three);
        threecnt=stucnt;
        stucnt=0;
        
        List<Integer> list=new ArrayList<>();
        int max = Math.max(onecnt, Math.max(twocnt, threecnt));
        if(onecnt==max) list.add(1);
        if(twocnt==max) list.add(2);
        if(threecnt==max) list.add(3);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i).intValue();
        }
        return answer;
    }
}
