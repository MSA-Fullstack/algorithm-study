class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		answer = new String[n]; 
        
		for(int i = 0; i < n; i++){
			String binnum = Integer.toBinaryString(arr1[i] | arr2[i]);
            
			while(binnum.length() < n){
				binnum = "0" + binary;
			}
			String str = "";
			for (int j = 0; j < n; j++){
				if(binary.charAt(j) == '1'){
					str += "#";
				} else{
					str += " ";
				}
			}
			answer[i] = str;
		}      
		return answer;
	}
}
