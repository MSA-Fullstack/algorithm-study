import java.lang.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        //0~9까지의 숫자 count 하기 위한 배열
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        // 숫자가 등장한 횟수 count
        for (char c : X.toCharArray()) {
            xCount[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        // 9부터 0까지, 짝지을 수 있는 횟수만큼 sb에 append하기
        for (int i = 9; i >= 0; i--) {
            int cnt = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < cnt; j++) {
                sb.append(i);
            }
        }

        // 결과가 없으면 -1 반환
        if (sb.length() == 0) return "-1";
        // 결과가 0으로만 구성돼 있으면 "0" 한 개만 반환
        if (sb.charAt(0) == '0') return "0";
        answer=sb.toString();
        return answer;
    }
}

