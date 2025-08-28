class Solution {
    public int solution(String dartResult) {
        int[] arr = new int[3];
        int arrIdx = 0;
        int idx = 0;

        while (idx < dartResult.length()) {
            int num = 0;
            // 숫자 처리 
            if (dartResult.charAt(idx) == '1' && idx + 1 < dartResult.length() && dartResult.charAt(idx + 1) == '0') {
                num = 10;
                idx += 2;
            } else {
                num = dartResult.charAt(idx++) - '0';
            }

            // 보너스 처리
            char bonus = dartResult.charAt(idx++);
            switch (bonus) {
                case 'S':
                    num = (int)Math.pow(num, 1);
                    break;
                case 'D':
                    num = (int)Math.pow(num, 2);
                    break;
                case 'T':
                    num = (int)Math.pow(num, 3);
                    break;
            }

            // 옵션 처리
            if (idx < dartResult.length()) {
                char option = dartResult.charAt(idx);
                if (option == '*') {
                    if (arrIdx > 0) arr[arrIdx - 1] *= 2;
                    num *= 2;
                    idx++;
                } else if (option == '#') {
                    num *= -1;
                    idx++;
                }
            }

            arr[arrIdx++] = num;
        }

        return arr[0] + arr[1] + arr[2];
    }
}


