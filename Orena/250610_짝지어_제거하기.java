class Solution
{
    public int solution(String s)
    {
        if (s.length() % 2 != 0) return 0; 
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int length = sb.length();
            
            if (length > 0 && sb.charAt(length - 1) == c) {
                sb.deleteCharAt(length - 1);
            } else {
                sb.append(c);
            }
        }
        
        return sb.length() == 0 ? 1 : 0;
    }
}
