import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        //1.공약수 구하기
        //1.1)약수 리스트 구하기
        List<Integer> list1 = new ArrayList<>(); //수1의 약수 모음
        List<Integer> list2 = new ArrayList<>(); //수2의 약수 모음
        int num1 = (int)Math.sqrt(n);
        int num2 = (int)Math.sqrt(m);
        for(int i=1;i<=num1;i++){
            if(n%i==0){
                list1.add(i);
                if(i != n/i){
                    list1.add(n/i);
                }
                
            }
        }
        for(int i=1;i<=num2;i++){
            if(m%i==0){
                list2.add(i);
                if(i != m/i){
                    list2.add(m/i);
                }
                
            }
        }

        //1.2)리스트에서 겹치는 수 중 가장 큰 수가 최대공약수이다.
        int gcd = 0;
        for(int div:list1){
            if(list2.contains(div)){ //다른 메서드에서 같은 약수를 가진 경우
                if(div>gcd){ //더 큰 수가 최대공약수 후보가 된다.
                    gcd=div;
                }
            }
        }
        //2. 최소 공배수 구하기
        int lcd = gcd*(n/gcd)*(m/gcd);
        answer = new int[2];
        answer[0] = gcd;
        answer[1] = lcd;
        
        
        return answer;
    }
}

