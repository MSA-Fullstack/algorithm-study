class Solution {
    public int solution(int left, int right) {
        int sum  = 0;
        int temp = left;
        int div = 0; //약수의 개수
        int st = 1;

        while(true){
            // System.out.println(temp + " "+st + " " +div);
            boolean isEnd = false; 
            //1.약수 구하기
            if(temp%st==0){
                div++;
                st++;
            }else{
                st++;
            }
            
            //1.1)약수 구하기 종료
            if(temp+1==st){
                isEnd = true;

                //1.2) 약수의 개수에 따라 합하기
                if(div%2==0){
                    sum+= temp;
                }else{
                    sum-=temp;
                }
            }else{//중간 수의 약수를 다 구하지 않은 경우
                continue;
            }          

            //2.1)마지막 수의 약수 구하기 종료된 경우
            // System.out.println(" "+isEnd+ " "+ sum );
            if(isEnd&&temp == right){//마지막 수의 약수를 다 구한 경우
                break;
            }else if(isEnd&&temp!=right){ //중간 수의 약수를 다 구한 경우
                temp++;
                div = 0;
                st = 1;
            }

        }

        return sum;
    }
}

