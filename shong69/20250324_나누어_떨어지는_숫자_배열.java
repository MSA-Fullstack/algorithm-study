class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for(Integer num:arr){
            if(num%divisor==0){
                list.add(num);
            }
        }
        if(list.size()==0){
            answer = new int[]{-1};
        }else{
            answer = new int[list.size()];
            for(int i = 0;i<list.size();i++){
                answer[i] = list.get(i);
            }
            java.util.Arrays.sort(answer);
        }
         
        
        return answer;
    }
}

