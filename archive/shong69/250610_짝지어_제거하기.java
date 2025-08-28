class Solution{
    public int solution(String s){
        char[] stack = new char[s.length()];
        char[] arr = s.toCharArray();
        int pnt = -1;
        for(int i=0;i<arr.length;i++){
            if(pnt >=0 && stack[pnt] == arr[i]){
                pnt--;
            }else{
                stack[++pnt]=arr[i];
            }
        }
        
        return pnt==-1?1:0;
    }
}

