import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        //겹치는 거 빼고 남는 숫자 중에서 최고의 경우와 최저의 경우의 순위를
        //배열에 담아서 리턴
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<win_nums.length;i++){
            for(int j=0;j<lottos.length;j++){
                if(win_nums[i]!=0&&win_nums[i]==lottos[j]){
                    list.add(win_nums[i]);
                }
            }
        }
        int num = 6;
        for(int i=0;i<lottos.length;i++){
            if(list.contains(lottos[i])==false&&lottos[i]!= 0){
                num--;
            }
        }
        //나머지 다 틀리고 하나만 0인 경우{1 2 3 4 5 0}{6 7 8 9 10}
        //최악의 경우 list.size()만큼만 맞고 최고는 num값만큼 맞거나
        answer=new int[]{7-num>=6?6:7-num,7-list.size()>=6?6:7-list.size()};
        return answer;
    }
}
