package DSA;

public class AllSubstringOfString {

	public static void main(String[] args) {
		String str = "abcd";
		printSubstring(str);
	}

	private static void printSubstring(String str) {
		for( int i = 0; i < str.length(); i++) {
			String sub = "";
			
			for(int j = i; j < str.length(); j++) {
				sub+=str.charAt(j);
				System.out.println(sub);
			}
		}
		
	}
}
