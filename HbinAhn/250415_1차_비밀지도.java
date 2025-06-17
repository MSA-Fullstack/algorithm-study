import java.util.*;

class Solution {
    public static String[] getBinary(int num, int n) {
        String[] array=new String[n];
        for(int i=0; i<n; i++) {
            array[i] = String.valueOf(num%2);
            num = num/2;
        } 
        return array;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer=new String[n];
        
        //각 값을 이진수로 만들고,
        for(int i=0; i<n; i++) {
            
            String word1[] = getBinary(arr1[i], n);
            String word2[] = getBinary(arr2[i], n);
            
            String Word ="";
            
            for(int j=n-1; j>=0; j--) {
                System.out.print(word2[j]);
                if(word1[j].equals("1")||word2[j].equals("1"))  {
                    Word += "#";
                }else Word += " ";
            }
            System.out.println();
            answer[i] = Word;
        }
        
        return answer;
    }
}
