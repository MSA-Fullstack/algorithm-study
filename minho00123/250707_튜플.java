class Solution {
    public int[] solution(String s) {
        String[] splittedByCommaArr = s.split("},");
        int[] answer = new int[splittedByCommaArr.length];
        int[][] tuples = new int[splittedByCommaArr.length][];
        
        for (int i = 0; i < splittedByCommaArr.length; i++) {
            String tupleStr = splittedByCommaArr[i];
            String[] splittedTuple = tupleStr.split(",");
            int[] tupleNum = new int[splittedTuple.length];
            
            for (int j = 0; j < splittedTuple.length; j++) {
                String str = splittedTuple[j].replace("{", "");
                str = str.replace("}", "");
                
                tupleNum[j] = Integer.parseInt(str);
            }
            
            tuples[tupleNum.length - 1] = tupleNum;
        }
        
        answer[0] = tuples[0][0];
        
        for (int i = 1; i < tuples.length; i++) {
            for (int j = 0; j < tuples[i].length; j++) {
                boolean hasNum = false;
                for (int k = 0; k < i; k++) {
                    if (answer[k] == tuples[i][j]) {
                        hasNum = true;
                    }
                }
                
                if (!hasNum) {
                    answer[i] = tuples[i][j];
                }
            }
        }

        return answer;
    }
}

