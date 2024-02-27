package sdetInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Vishal";
		char[] array = str.toCharArray();
		int left, right = str.length()-1;
		
		// Using swapping
		for(left = 0; left < right; left++, right--) {
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
		}

		System.out.println(new String(array));
	}
}
