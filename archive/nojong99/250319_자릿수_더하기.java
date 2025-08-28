import java.util.Scanner;

public class Solution {
public static int solution(int n) {

```
	String lst=n+"";
	int answer=0;
	for(int i=0; i<lst.length(); i++) {
		answer+=lst.charAt(i)-'0';
	}
	return answer;

}

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	System.out.println(solution(n));
}

```

}


