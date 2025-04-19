import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        //1번 : 12345 반복
        //2번 : 21 23 24 25 반복
        //3번 : 33 11 22 44 55 반복
        //정답 배열이 들어왔을 때 가장 많이 겹치는 사람 idx 리턴
        //idx % 5, idx % 8, idx % 10 해서 idx로 구하기
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int[] result = {0,0,0};
        for(int i=0;i<answers.length;i++){
            if(arr1[i%5]==answers[i]){
                result[0]++;
            }
            if(arr2[i%8]==answers[i]){
                result[1]++;
            }
            if(arr3[i%10]==answers[i]){
                result[2]++;
            }
        }
        int num = result[0]>=result[1]?0:1;
        if(result[0]==result[1]){
            //두 수가 같은 경우
            if(result[0]==result[2]){
                //세 수가 똑같은 경우
                answer = new int[]{1,2,3};
            }else if(Math.max(result[num],result[2])==result[2]){
                //num3이 젤 큰 경우
                answer = new int[]{3};
            }else if(result[0]>result[2]){
                //num1, num2가 젤 큰 경우
                answer = new int[]{1,2};
            }
        }else{
            //num1,num2 중 한 수만 큰 경우
            if(result[num]==result[2]){
                //한 수와 num3이 똑같이 큰 경우
                answer=new int[]{num+1,3};
            }else if(result[num]<result[2]){
                //한 수만 큰 경우
                answer = new int[]{3};
            }else if(result[num]>result[2]){
                //num3이 젤 큰 경우
                answer = new int[]{num+1};
            }
        }
        
        return answer;
    }
}

