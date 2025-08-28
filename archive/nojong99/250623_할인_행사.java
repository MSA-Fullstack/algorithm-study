import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        
        Map<String, Integer> ShoppingMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            ShoppingMap.put(want[i], number[i]);
        }

       
        for (int i = 0; i <= discount.length - 10; i++) {
            
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = 0; j < 10; j++) {
                discountMap.put(discount[i + j], discountMap.getOrDefault(discount[i + j], 0) + 1);
            }

            
            boolean canRegister = true;
            for (Map.Entry<String, Integer> entry : ShoppingMap.entrySet()) {
                String item = entry.getKey();
                int requiredCount = entry.getValue();

                // 품목이 없거나, 수량 부족 시
                if (!discountMap.containsKey(item) || discountMap.get(item) < requiredCount) {
                    canRegister = false;
                    break;
                }
            }

            
            if (canRegister) {
                answer++;
            }
        }

        return answer;
    }
}

