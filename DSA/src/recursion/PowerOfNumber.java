package recursion;

public class PowerOfNumber {

	public static void main(String[] args) {
		System.out.println(Power(2, 5));

	}

	private static int Power(int num, int n) {
		
		if (n == 0)
			return 1;
		
		int smallerProb = Power(num, n - 1);
		int bigger = num * smallerProb;
		
		return bigger;
		
	}
	
	

}
