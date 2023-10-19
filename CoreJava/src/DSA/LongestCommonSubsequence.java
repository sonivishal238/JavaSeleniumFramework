package DSA;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		
		System.out.println(longestCommonSub(a, b));
	}
	
	static int longestCommonSub(String text1, String text2) {
		return solve(text1, text2, 0, 0);
	}
	
	static int solve(String a, String b, int i, int j) {
		// base case
		if(i == a.length())
			return 0;
		if(j == b.length())
			return 0;
		
		int ans = 0;
		
		if(a.charAt(i) == b.charAt(j)) {
			ans = 1 + solve(a, b, i+1, j+1);
		}
		
		else {
			ans = Math.max(solve(a, b, i+1, j), solve(a, b, i, j+1));
		}
		
		return ans;
	}
}
