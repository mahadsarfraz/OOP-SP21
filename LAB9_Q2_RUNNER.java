package Q2;

import java.util.StringTokenizer;

public class LAB9_Q2_RUNNER {
	public static void main(String[] args) {
		StringTokenizer a1 = new StringTokenizer("For the Night is dark and full of terrors");
		CustomStringTokenizer c1 = null;
		while(a1.hasMoreTokens()) {
			c1 = new CustomStringTokenizer(a1.nextToken());
		}
		
		int token_count = c1.countToken();
		System.out.println(token_count);
		
	}
}
