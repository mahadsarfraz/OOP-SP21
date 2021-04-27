package Q2;

public class CustomStringTokenizer {
	static int token_count = 0;
	
	CustomStringTokenizer(String token){
		boolean isNum = false;
		
		if(token.charAt(0) >= '0' && token.charAt(0) <= '9') {
			isNum = true;
		}
		if(!isNum) {
			token_count++;
		}
	}
	
	public int countToken() {
		return token_count;
	}
}
