class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<arr1.length; i++){
            answer[i]="";
            for(int j=1; j<n+1; j++){
                int a=0;
                int b=0;
                if(arr1[i]-(int)Math.pow(2,n-j)>=0) {
                    arr1[i]=arr1[i]-(int)Math.pow(2,n-j);
                    a=1;
                } else a=0;
                if(arr2[i]-(int)Math.pow(2,n-j)>=0) {
                    arr2[i]=arr2[i]-(int)Math.pow(2,n-j);
                    b=1;
                } else b=0;
                if(a==1 || b==1) {answer[i]+="#";}
                else {answer[i]+=" ";}
            }
        }
        return answer;
    }
}
