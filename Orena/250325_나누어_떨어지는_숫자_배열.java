import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list=new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor==0) {
				list.add(arr[i]);
			}
		}
		if(list.size()==0) {
			list.add(-1);
		}
		
		list.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return (Integer)o1-(Integer)o2;
			}
		});
		int[] answer=new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i]=list.get(i).intValue();
		}
        return answer;
    }
}
