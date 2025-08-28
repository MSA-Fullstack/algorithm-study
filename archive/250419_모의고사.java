class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[]{0,0,0};
        int[] s1=new int[]{1,2,3,4,5};
        int[] s2=new int[]{2,1,2,3,2,4,2,5};
        int[] s3=new int[]{3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++) {
                if(s1[i%5]==answers[i]) answer[0]++;
                if(s2[i%8]==answers[i]) answer[1]++;
                if(s3[i%10]==answers[i]) answer[2]++;
            }
        
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        int maxS=0;
        for(int i=0; i<answer.length; i++) {
            if(max==answer[i]) maxS++;
        }
        
        int[] answerList=new int[maxS];
        int idx=0;
        for(int i=0; i<answer.length; i++) {
            if(max==answer[i]) {
                answerList[idx]=i+1;
                idx++;
            }
        }
        
        return answerList;
    }
}

