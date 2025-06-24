class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        while (true) {
            if (a % 2 == 0 && b % 2 == 1 && a - b == 1) {
                break;
            } else if (a % 2 == 1 && b % 2 == 0 && b - a == 1) {
                break;
            }
            
            a = (int) Math.ceil(a / 2.0);
            b = (int) Math.ceil(b / 2.0);
            
            answer++;
        }

        return answer;
    }
}

