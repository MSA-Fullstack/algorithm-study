import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i=0;i<arr.length-1;i++){
            int maxNum = Math.max(arr[i],arr[i+1]);
            int minNum = Math.min(arr[i],arr[i+1]);
            while(minNum!=0){
                int temp = minNum;
                minNum = maxNum%minNum;
                maxNum = temp;
            }
            int gcd = maxNum;
            int lcd = Math.max(arr[i],arr[i+1])/maxNum*Math.min(arr[i],arr[i+1]);
            arr[i+1]=lcd;
        }
        return arr[arr.length-1];
    }
}
