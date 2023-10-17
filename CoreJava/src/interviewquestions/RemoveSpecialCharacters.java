package interviewquestions;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		String str = "snjxcbsjxnjsxn 686767676 &^&%$#*^*(&*^*^&^&*&*&* ABHBHBHXWB";
		String pattern = "[^a-zA-Z0-9]";
		
		str = str.replaceAll(pattern, "");
		System.out.println(str);
	}
}
