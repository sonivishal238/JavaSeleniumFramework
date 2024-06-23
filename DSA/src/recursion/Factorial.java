package recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(CalculateFactorial(5));
	}

	private static int CalculateFactorial(int n) {
		// TODO Auto-generated method stub
		if(n == 0)
			return 1;
		
		int smallProblem = CalculateFactorial(n - 1);
		int bigProblem = n * smallProblem;
		
		return bigProblem;
	}
}
