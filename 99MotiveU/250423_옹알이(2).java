class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] cansk = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String temp = babbling[i];
            boolean isInvalid = false;
            // 연속된 같은 발음이 있는지 확인
            for (int j = 0; j < cansk.length; j++) {
                if (temp.contains(cansk[j] + cansk[j])) {
                    isInvalid = true;
                    break;
                }
            }
            if (isInvalid) {
                continue;
            }
            // 유효한 발음을 공백으로 바꾸기
            for (int j = 0; j < cansk.length; j++) {
                temp = temp.replace(cansk[j], " ");
            }
            // 공백 제거 후 아무것도 안 남으면 발음 가능한 단어
            if (temp.replace(" ", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
