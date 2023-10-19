package DSA;

import java.util.LinkedHashSet;
import java.util.Set;

public class longesrSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "aababcdef";
		System.out.println(printLongestLength(str));
				
	}

	private static int printLongestLength(String s) {
		int left = 0, right = 0, max = 0;
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		while(right < s.length()) {
			char c = s.charAt(right);
			
			if(set.add(c)) {
				max = Math.max(max, right-left+1);
				right++;
			}
			
			else {
				while(s.charAt(left)!=c) {
					set.remove(s.charAt(left));
					left++;
				}
				set.remove(c); left++;
			}
		}
		
		
		return max;
	}
}
