import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] num=new int[3];
		String[] bonus=new String[3];
		StringTokenizer st1=new StringTokenizer(dartResult.replaceAll("[a-zA-Z#*]", " "));
		while(st1.hasMoreTokens()) {
			for(int i=0; i<num.length; i++) {
				num[i]=Integer.parseInt(st1.nextToken());
			}
		}
		StringTokenizer st2=new StringTokenizer(dartResult.replaceAll("[0-9]", " "));
		while(st2.hasMoreTokens()) {
			for(int i=0; i<bonus.length; i++) {
				bonus[i]=st2.nextToken();
			}
		}
		for(int i=0; i<num.length; i++) {
			if(bonus[i].contains("S")) num[i]=(int) Math.pow(num[i], 1);
			if(bonus[i].contains("D")) num[i]=(int) Math.pow(num[i], 2);
			if(bonus[i].contains("T")) num[i]=(int) Math.pow(num[i], 3);
		}
		for(int i=0; i<num.length; i++) {
			if(bonus[i].contains("*")&&i!=0) {
				num[i-1]=num[i-1]*2;
				num[i]=num[i]*2;
			} else if(bonus[i].contains("*")&&i==0) num[i]=num[i]*2;
			if(bonus[i].contains("#")) num[i]=num[i]*(-1);
		}
		answer=num[0]+num[1]+num[2];
        return answer;
    }
}

