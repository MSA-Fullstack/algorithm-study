import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] seoul) {
        List<String> list=new ArrayList<>(Arrays.asList(seoul));
		int index=list.indexOf("Kim");
		
		String answer="김서방은 "+index+"에 있다";
        return answer;
    }
}
