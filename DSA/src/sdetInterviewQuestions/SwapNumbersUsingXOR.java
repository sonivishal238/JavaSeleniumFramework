package sdetInterviewQuestions;

public class SwapNumbersUsingXOR {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// Khud maths krke dekh lena
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
