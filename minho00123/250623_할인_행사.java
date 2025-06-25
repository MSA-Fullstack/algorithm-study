import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int count = 0;

        while (count <= discount.length - 10) {
            int[] temp = Arrays.copyOf(number, number.length);

            for (int i = count; i < count + 10; i++) {
                for (int j = 0; j < want.length; j++) {
                    if (discount[i].equals(want[j])) {
                        if (temp[j] > 0) {
                            temp[j]--;
                        }

                        break;
                    }
                }
            }
            
            int sum = 0;
            for (int i = 0; i < temp.length; i++) {
                sum += temp[i];
            }
            
            if (sum == 0) {
                answer++;
            }
            
            count++;
        }
        
        return answer;
    }
}

