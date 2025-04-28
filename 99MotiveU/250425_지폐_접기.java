class Solution {
     public int solution(int[] wallet, int[] bill) {
         int answer = 0;
 
         int walletW = Math.min(wallet[0], wallet[1]);
         int walletH = Math.max(wallet[0], wallet[1]);
 
         int billW = Math.min(bill[0], bill[1]);
         int billH = Math.max(bill[0], bill[1]);
 
         while (!((billW <= walletW && billH <= walletH) || (billH <= walletW && billW <= walletH))) {
             boolean cutWidth = billW >= billH;
             billW = cutWidth ? billW / 2 : billW;
             billH = cutWidth ? billH : billH / 2;
             answer++;
         }
 
         return answer;
     }
 }
