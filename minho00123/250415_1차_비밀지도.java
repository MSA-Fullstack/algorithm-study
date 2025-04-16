class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String arr1Bin = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i])));
            String arr2Bin = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i])));
            
            String map = "";
            for (int j = 0; j < n; j++) {
                if (arr1Bin.charAt(j) == '1' || arr2Bin.charAt(j) == '1') {
                    map += "#";
                } else {
                    map += " ";
                }
            }
            
            answer[i] = map;
        }
        
        return answer;
    }
}

