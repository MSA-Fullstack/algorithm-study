import java.util.*;
class Solution {    
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        Num[] loseR = new Num[N]; //idx 별 스테이지의 실패율임 -> 나중에 내림차순으로 정렬
        for(int i=1;i<N+1;i++){
            int challNum = 0; //도전자 수
            int clearNum = 0; //클리어 수
            for(Integer stg:stages){
                if(stg>=i){
                    challNum++;
                    if(stg>i) clearNum++;
                }
            }
            if(challNum==0||challNum==clearNum){
                Num num = new Num(i-1,0);
                loseR[i-1]=num;
            }else{
                Num num = new Num(i-1,(double)(challNum-clearNum)/challNum); //int 자료형 double로 연산
                loseR[i-1] = num;
            }
        }
        
        Arrays.sort(loseR);
        answer = new int[N];
        for(int i=0;i<N;i++){
            answer[i] = loseR[i].idx+1;
        }
        return answer;
    }
}
class Num implements Comparable<Num>{
    int idx;
    double val;
    public Num(int idx, double val){
        this.idx = idx;
        this.val = val;
    }
    public int compareTo(Num num){
        if(this.val == num.val){
            return this.idx - num.idx;
        }else{
            return Double.compare(num.val,this.val); //double 자료형의 비교
        }   
    }
}

