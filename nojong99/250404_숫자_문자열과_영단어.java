class Solution {
    public static int solution(String s) {
        int answer = 0;
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i =0; i<num.length; i++){
            if(s.contains(num[i])){
                
                s=s.replace(num[i],String.valueOf(i));
               
            }    
        }
        answer=Integer.valueOf(s);
        return answer;
    }
}



