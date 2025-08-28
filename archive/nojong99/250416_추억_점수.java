class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int size = photo.length;
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
           for(int k=0; k<photo[i].length; k++){
              for(int j=0; j<name.length; j++){
                       if(photo[i][k].equals(name[j])){
                           answer[i]+=yearning[j];
                       }
                }       
            }
        }        
        return answer;
    }
}

