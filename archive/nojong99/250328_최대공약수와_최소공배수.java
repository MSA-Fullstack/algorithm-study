class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int nm=0;
        int mm=0;
        for(int i=1; i<=Math.max(n,m); i++){
            if(n%i==0 && m%i==0){//최대공약수
                nm = Math.max(nm,i);
            }
        }
        //최소공배수
        mm=(n/nm)*(m/nm)*nm;
        answer[0]=nm;
        answer[1]=mm;
                
        return answer;
    }
}

